import java.util.Optional;

public class _02_OptinalClass {
    public static void main(String[] args){
    getUser()
                .map(x -> x.address)
                .map(y -> y.city)
                .ifPresent(System.out::println);
    }

    private static Optional<User> getUser() {

        Address a = new Address();
        a.city = "delhi";

        User u = new User();
        u.address = a;

        return Optional.of(u);
    }
}

class User {
    public Address address;
}


class Address{
    public String city;
}


//map() := If value present then apply the map, and return optinal. else -->remains empty.
// stream() = [User1, User2, User3.....]
//Optional ---> [User]
//flateMap() := objcet inside object 
//Optional classes : = optional stream object ko wrrape karti hain and used to for not return null value.
