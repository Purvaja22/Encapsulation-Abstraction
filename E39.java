import java.util.*;
class Author
{
	private String name;
	private String email;
	private String gender;
	Author(String name, String email, String gender)
	{
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
}

class Book
{
	String name;
	double price;
	Author author;
	int qtyInStock;
	public void setName(String name)
	{
		this.name = name;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public void setAuthor(Author author)
	{
		this.author = author;
	}
	public void setQtyInStock(int qtyInStock)
	{
		this.qtyInStock = qtyInStock;
	}
	public String getName()
	{
		return name;
	}
	public double getPrice()
	{
		return price;
	}
	public Author getAuthor()
	{
		return author;
	}
	public int getQtyInStock()
	{
		return qtyInStock;
	}
 }

class E39
{
	public static void main(String args[])
	{
		Book b = new Book();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Book Name");
		String s1 = s.nextLine();
		System.out.println("Enter Price of the book");
		double s2 = s.nextDouble();
		System.out.println("Enter Name of Author of Book");
		String s3 = s.nextLine();
		System.out.println("Enter Email of Author");
		String s4 = s.nextLine();
		System.out.println("Enter Gender of Author(m/f)");
		String s5 = s.nextLine();
		System.out.println("Enter Quantity of Books");
		int s6 = s.nextInt();
		Author a = new Author(s3, s4, s5);
		b.setName(s1);
		b.setPrice(s2);
		b.setAuthor(a);
		b.setQtyInStock(s6);
		System.out.println("Book Name : "+b.getName());
		System.out.println("Book Price : "+b.getPrice());
		System.out.println("Book Author, Book Author Email, Book Author Gender : "+b.getAuthor());
		System.out.println("Book Quantity in Stock : "+b.getQtyInStock());
	}
}