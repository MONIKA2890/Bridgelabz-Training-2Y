class InvalidRatingException extends Exception {
    InvalidRatingException(String msg){ super(msg); }
}
class EmptyReviewException extends Exception {
    EmptyReviewException(String msg){ super(msg); }
}

class ProductReview{
    public void submitReview(int rating, String comment) throws InvalidRatingException, EmptyReviewException {
        if(rating < 1 || rating > 5) throw new InvalidRatingException("Invalid rating: " + rating);
        if(comment == null || comment.isEmpty()) throw new EmptyReviewException("Review comment cannot be empty");
        System.out.println("Review submitted: Rating=" + rating + ", Comment=" + comment);
    }
}

public class ReviewTest1 {
    public static void main(String[] args) {
        ProductReview pr = new ProductReview();
        try {
            pr.submitReview(6, "Excellent!");
        } catch (InvalidRatingException | EmptyReviewException e) {
            System.out.println(e.getMessage());
        }
    }
}

