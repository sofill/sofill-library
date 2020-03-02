package dao;

import java.util.Date;

public class RentalDAO {

  private Date rentalDate;
  private Date returnDate;
  private String bookTitle;
  private String userId;

  public Date getRentalDate() {
    return rentalDate;
  }
  public void setRentalDate(Date rentalDate) {
    this.rentalDate = rentalDate;
  }
  public Date getReturnDate() {
    return returnDate;
  }
  public void setReturnDate(Date returnDate) {
    this.returnDate = returnDate;
  }
  public String getBookTitle() {
    return bookTitle;
  }
  public void setBookTitle(String bookTitle) {
    this.bookTitle = bookTitle;
  }
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

}
