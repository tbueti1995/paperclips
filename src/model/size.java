// File: size.java
// Author: Thomas E. Bueti
// NetID: tbueti

// Size Class
public enum paperclip-size {

  SMALL(0.75),
  MEDIUM(1.99),
  LARGE(2.25);

  private final double price;
  paperclip-size(double p) { this.price = p; }
  public double getPrice() { return this.price; }

}
