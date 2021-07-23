package toruk.UserManagement.core.utilities.results;

public class DataResult<T> extends Result{

    private T data;
    public DataResult(T data, boolean success, String message) {
        super(success, message);
    }
    public DataResult(T data, boolean success) {
        super(success);
    }

    public T getData(){
        return this.data;
    }

//    public class SuccessDataResult
}
