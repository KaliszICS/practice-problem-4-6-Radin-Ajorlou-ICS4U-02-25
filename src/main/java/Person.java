class Person{
    private String firstname;
    private String lastname;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String ssn;
    private int numberOfSiblings;
    private Person[] siblings;

    public Person(String firstname, String lastname, int birthDay, int birthMonth, int birthYear, String ssn){
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.ssn = ssn;
        this.numberOfSiblings = 0;
        this.siblings = new Person[0];
    }

    public String getFirstname(){
        return firstname;
    }

    public String getLastname(){
        return lastname;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public String getBirthday(){
        return birthDay + "/" + birthMonth + "/" + birthYear;
    }

    public void addSibling(Person sibling){
        Person[] newSiblings = new Person[this.siblings.length + 1];
        for (int i = 0; i < siblings.length; i++){
            newSiblings[i] = siblings[i];
        }
        newSiblings[newSiblings.length - 1] = sibling.clone();
        this.siblings = newSiblings;
        this.numberOfSiblings++;
    }

    @Override 
    public Person clone(){
        return new Person(this.firstname, this.lastname, this.birthDay, this.birthMonth, this.birthYear, this.ssn);
    }

    public Person[] getSiblings(){
        return this.siblings;
    }
}