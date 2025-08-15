package com.example.paymentapp.entity;
import jakarta.persistence.*;
import java.time.LocalDate;
@Entity
public class Payment {
  @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
  private String category;
  private String description;
  private Double amount;
  private LocalDate dueDate;
  private Boolean paid = false;
  private LocalDate paidDate;
  private String owner;
  public Payment() {}
  // getters/setters omitted for brevity in this template (add via Lombok or IDE)
  public Long getId(){return id;} public void setId(Long id){this.id=id;}
  public String getCategory(){return category;} public void setCategory(String c){this.category=c;}
  public String getDescription(){return description;} public void setDescription(String d){this.description=d;}
  public Double getAmount(){return amount;} public void setAmount(Double a){this.amount=a;}
  public LocalDate getDueDate(){return dueDate;} public void setDueDate(LocalDate d){this.dueDate=d;}
  public Boolean getPaid(){return paid;} public void setPaid(Boolean p){this.paid=p;}
  public LocalDate getPaidDate(){return paidDate;} public void setPaidDate(LocalDate d){this.paidDate=d;}
  public String getOwner(){return owner;} public void setOwner(String o){this.owner=o;}
}
