import java.util.Arrays;

/*
[2] You are given a sequence of words S, and a sequence of words T. Find the shortest continuous subsequence of words in S such that the words in T appear in that order. Handling of capitalization, punctuation, tie-breaking, etc. are optional.

Example:
"One Ring to rule them all, One Ring to find them, One Ring to bring them all and in the darkness bind them", ["find", "them", "all"] --> "find them, One Ring to bring them all" */
public class ShortestContinuousSubsequence {

    public  static  void main(String args[])
    {

        String sentence = "made weather forecast says that made rain in spain stays";

        String[] words = { "made", "in", "spain" };

        String ans=shortestContinuousSubsequence(sentence,words);

        System.out.println(sentence.indexOf(ans));


    }
    public static String shortestContinuousSubsequence(String fullSeqOfWords, String[] selectedSeqOfWords) {
        String[] fullSeqArray = createWordArray(fullSeqOfWords);
        if(selectedSeqOfWords.length > fullSeqArray.length)  {
            throw new IllegalArgumentException("Selected subsequence is longer than full sequence");
        }

        //Find first word in the selected sequence
        int fullSeqindex = 0;
        while(!fullSeqArray[fullSeqindex].equals(selectedSeqOfWords[0]) && fullSeqindex < fullSeqArray.length) {
            fullSeqindex++;
        }

        if(fullSeqindex == fullSeqArray.length) {
            throw new IllegalArgumentException("Full sequence does not contain selected subsequence");
        }

        //Safe simple solution but inefficent. Plenty of optimizations can be made.
        int selectedSequenceIndex = 1;
        String[] shortestSubsequenceArray = null;
        for(int i = fullSeqindex; i < fullSeqArray.length; i++) {
            for(int j = i; j < fullSeqArray.length; j++) {
                if(fullSeqArray[j].equals(selectedSeqOfWords[selectedSequenceIndex])) {
                    selectedSequenceIndex++;
                }
                if(selectedSequenceIndex == selectedSeqOfWords.length) {
                    if(shortestSubsequenceArray == null ||  j - i < shortestSubsequenceArray.length) {
                        shortestSubsequenceArray = Arrays.copyOfRange(fullSeqArray, i, j+1);
                        selectedSequenceIndex = 0;
                    }
                    break;
                }
            }
        }

        if(shortestSubsequenceArray == null) {
            throw new IllegalArgumentException("Full sequence does not contain selected subsequence");
        }

        StringBuilder str = new StringBuilder("");
        for(int i = 0; i < shortestSubsequenceArray.length - 1; i++) {
            str.append(shortestSubsequenceArray[i] + " ");
        }
        str.append(shortestSubsequenceArray[shortestSubsequenceArray.length - 1]);

        return str.toString();
    }

    private static String[] createWordArray(String sentence) {
        String[] wordArray = sentence.split(" ");
        for(int i = 0; i < wordArray.length; i++) {
            //does not account for characters 91-96
            if((wordArray[i].charAt(wordArray[i].length()-1) < 'A' ||  wordArray[i].charAt(wordArray[i].length()-1) > 'z')) {
                wordArray[i] = wordArray[i].substring(0, wordArray[i].length()-1);
            }
        }
        return wordArray;
    }
}