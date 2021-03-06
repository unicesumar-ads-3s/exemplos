// Example taken from Coders Campus (https://howtoprogramwithjava.com/java-loops/)

public class QuickTest {
 
  public static void main (String[] args)
  {
    // get some pre-existing list
    List<Contact> contactList = getContacts();
    // find out how big the list is
    Integer sizeOfList = contactList.size();
 
    // initialize your TO: field for the email addresses
    String emailToField = "";
 
    // iterate through the contacts and extract
    // the email addresses for the TO: field
    for (int i=0; i<sizeOfList; i++)
    {
      Contact contact = contactList.get(i);
      emailToField = emailToField + contact.getEmailAddress() + ", ";
    }
 
    // remove the trailing comma and space at the end of the String
    emailToField = emailToField.substring(0, emailToField.length()-2);
    System.out.println(emailToField);
  }
 
  private static List<Contact> getContacts()
  {
    List<Contact> contacts = new ArrayList<Contact>();
 
    contacts.add(new Contact("abc@abc.com"));
    contacts.add(new Contact("abc1@abc.com"));
    contacts.add(new Contact("abc2@abc.com"));
    contacts.add(new Contact("abc3@abc.com"));
    contacts.add(new Contact("abc4@abc.com"));
    return contacts;
  }
 
  private static class Contact
  {
    private String emailAddress;
 
    public String getEmailAddress() {
      return emailAddress;
    }
 
    public Contact (String email)
    {
      this.emailAddress = email;
    }
  }
}
