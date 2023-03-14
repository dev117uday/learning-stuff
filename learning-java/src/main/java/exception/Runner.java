package exception;

public class Runner {
    public static void main(String[] args) throws CustomCheckedException {
        // need throws keyword
        // throw new CustomCheckedException("");
        throw new CustomUncheckedException("");
    }
}
