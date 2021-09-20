package ru.geekbrains.mycalculator;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import ru.geekbrains.mycalculator.domain.Logic;

public class MainActivity extends AppCompatActivity {

    private static final String COUNTER_KEY = "COUNTER_KEY";
    // Основной класс, реализующий логику калькулятора (здесь он создаётся, но не инициализируется,
    // потому что здесь ещё MainActivity не создана
    private Logic logic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Инициализация класса logic и передача в него ссылки на класс MainActivity,
        // чтобы можно было в нём пользоваться элементами макета "activity_main"
        // В этом методе MainActivity создана, поэтому в качестве this будет передан MainActivity,
        // а не null
        logic = new Logic(this);
    }
}