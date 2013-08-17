
public class BinaryAndDecimal {
    BinaryValue binaryValue = new BinaryValue();
    Integer temp;

    public Integer[] sorting(Integer[] givenNumbers) {
        for (int i = 0; i < givenNumbers.length; i++) {
            for (int j = i + 1; j < givenNumbers.length; j++) {
                if (binaryValue.countNumberOfOne(givenNumbers[i]) < binaryValue.countNumberOfOne(givenNumbers[j]))  {
                   temp = givenNumbers[i];
                   givenNumbers[i] = givenNumbers[j];
                    givenNumbers[j] = temp;
                }
                else {
                    if (binaryValue.countNumberOfOne(givenNumbers[i]) == binaryValue.countNumberOfOne(givenNumbers[j])) {
                        if(givenNumbers[i]>givenNumbers[j])
                            temp = givenNumbers[i];
                            givenNumbers[i] = givenNumbers[j];
                            givenNumbers[j] = temp;
                    }
                }
            }

        }
        return givenNumbers;
    }

}
