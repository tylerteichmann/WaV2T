for (let i = 1; i <= 100; i++) {
    if (i % 3 == 0) {
        if (i % 5 == 0) {
            console.log("Fizzbuzz");
        }
        console.log("Fizz");
    }
    if (i % 5 == 0) {
        console.log("Buzz");
    }
}