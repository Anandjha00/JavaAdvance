 class Book {

  static int totalNoOfBooks= 0; 

  String title;
  String author;
  String isbn;

  boolean isBorrowed;
  
// Creating constructor 

  Book(String title,String author,String isbn){
    this.title=title;
    this.isbn=isbn;
    this.author=author;
    
  }// Creating another constructor
  Book(String isbn){
   this("unknown","unknown", isbn);
  }
  static int  totalNoOfBooks(){
    return totalNoOfBooks;
  }
  {
    totalNoOfBooks++;
  }

  
  void borrowBook(){
    if (isBorrowed) {
      System.out.println("This book is already borrowed!");
    }else{
      this.isBorrowed=true;
      System.out.println("Enjoy the Book!");
    }

  }
  void returnBook(){
    if (isBorrowed) {
      this.isBorrowed=false;
      System.out.println("Hope you enjoyed the Book!");
      
    }else{
      System.out.println("This book is already returned !");
    }

  }
  // passing all the values and cheak 

  public static void main(String[] args) {
    Book rashmirathi=new Book("1");
    Book ThinAndGrowRich=new Book("1");
    Book urvashi=new Book("Uravashi", "Ramdhari Singh Dinkar", "3");
    urvashi.borrowBook();
    rashmirathi.borrowBook();
    ThinAndGrowRich.borrowBook();
    System.out.println(urvashi.author);
    System.out.println(urvashi.title);
    System.out.println(ThinAndGrowRich.isBorrowed);
    System.out.println(totalNoOfBooks);


  }
}
