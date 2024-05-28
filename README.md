
<h1>Lecture 3: Constructors</h1>
<a href="https://youtu.be/6Xa6oQYuav4?si=tbiF-ssGSdc9qRWA">
<img src="https://github.com/Yogaprasadmk/Object-oriented-Programming-A-to-Z-Course/assets/120255515/eb4ce0e4-7a57-4af6-86d5-debf664d35a9">
</a>
<h3>Code:</h3>

```js
// constructor
class Constructors{
    int id;
    int age;
    
    Constructors(int id,int age){
        this.id = id;
        this.age = age;
        System.out.println("Hello");
    }
}


public class Main{

    public static void main (String[] args) {
        
        Constructors A = new Constructors(23,5);
    }
}

```
<h3>Two types of Constructors</h3>

<h4> Default Constructors</h4>

```js
class Constructors{
    Constructors(){
        System.out.println("Default Constructor");
    }
}


public class Main{

    public static void main (String[] args) {
        
        Constructors A = new Constructors();
    }
}
```

<h4> Parameter Constructor</h4>

```js
class Constructors{
    int id;
    int age;

    Constructors(int id,int age){
        this.id = id;
        this.age = age;
        System.out.println("Parameter Constructors");
    }
}

public class Main{

    public static void main (String[] args) {
        
        Constructors A = new Constructors(23,5);
    }
}

```
<br/>
<hr/>
<h1>Lecture 4: Four Pillars of OOPS</h1>

<a href="https://youtu.be/NTXBHfUo9-4?si=cJcDxVrxr1NFM05j"><img src="https://github.com/Yogaprasadmk/Object-oriented-Programming-A-to-Z-Course/assets/120255515/31630839-c09e-4d69-84fb-af6b816ab553"></a>

<h4>Codes:</h4>

<h5>Abstraction:</h5>

<img src="https://github.com/Yogaprasadmk/Object-oriented-Programming-A-to-Z-Course/assets/120255515/dafab9d4-9696-4fb5-b251-b8b31788c6f8">

```js
```

<h5>Encapsulation:</h5>

<img src="https://github.com/Yogaprasadmk/Object-oriented-Programming-A-to-Z-Course/assets/120255515/2b999b5c-62c1-4f3e-980a-789027410050">
```js
```

<h5>Polymorphism</h5>

<img src="https://github.com/Yogaprasadmk/Object-oriented-Programming-A-to-Z-Course/assets/120255515/90683d35-ac2a-40ac-be18-ce9d968c43a5">
```js
```

<h5>Inheritance</h5>

<img src="https://github.com/Yogaprasadmk/Object-oriented-Programming-A-to-Z-Course/assets/120255515/725b388e-8b9f-47cf-ad61-c89c300000a3">

```js
```
<br/>
<hr/>
