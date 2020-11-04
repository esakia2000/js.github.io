დავალება:

    //მოცემულია ობიექტი
    var user = {
        name: "giorgi",
        age: 25,
        gender: "male"
    };

if (user.age < 18) {
    console.log("arasrulwlovani")
} else if (user.age >= 18 && user.gender == "male") {
    console.log('srulwlovani bichi')
} else {
    console.log('error')
}

//დაწერეთ შემდეგი პირობები:
//თუ ასაკი ნაკლებია 18 დაიწეროს "არასრულწლოვანი";
// თუ ასაკი მეტია ან ტოლი 18-ზე და სქესი არის "male" დაიწეროს "სრულწლოვანი ბიჭი";


//მოცემულია მასივი:
let cars = ["audi", "bmw", "lexus", "volkswagen", "ferrary", "porsche"];


//ციკლის დახმარებით, ეკრანზე გამოიტანეთ ყველა ელემენტი, დაწყებული მეორე ელემენტისგან მე-5ის ჩათვლით;
for (let i = 1; i < cars.length; i++) {
    console.log(cars[i])
}
//შექმენით სახელების მასივი და დაბეჭდეთ ის სახელები რომლისს სიმბოლების რაოდენობა 5 ზე მეტია;
let names = ['saba', 'nikolozi', 'dato', 'kristina']
for (let i = 0; i < names.length; i++) {
    if (names[i].length > 4) {
        console.log(names[i])
    }
}
//შექმენით ციფრების მასივი და გამოიტანეთ მარტო ლუწი რიცხვები და მარტო კენტი რიცხვები;
var numbers = [23, 11, 22, 43, 20]
for (let i = 0; i < numbers.length; i++) {
    if (numbers[i] % 2 == 0) {
        console.log(numbers[i])
    }
}

//მოცემულია მასივი:
let prison = ["name", "age", 25, 50, "surname", [100, 500]];
//ჩადგმული მასივიდან ამოიღეთ მეორე ელემენტი; ანუ 500;
console.log(prison[5][1])

//მოცემულია ობიექტი
var person = {
    firstname: "john",
    lastname: "doe",
    age: 50,
    eyecolor: "blue"
};

//ამოიღეთ person ცვლადის თვალის ფერი;
console.log(person.eyecolor)

//შექმენით მასივი, და დაბეჭდეთ სათითაოდ თითოეული ელემენტი
var last = ['saba', 'luka', 'nika', 'dato', 20]
for (let i = 0; i < last.length; i++) {
    console.log(i)
}