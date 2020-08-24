package io.github.thunderz99;

public class App {

    public static void main(String[] args) {

        var app = Javalin.create();
        app.get("/", ctx -> ctx.result("hello predownload jars"));
		app.start(7000);
    }

}
