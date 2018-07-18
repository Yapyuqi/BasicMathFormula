package sg.edu.rp.c346.basicmathformula;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    
    ListView lvFormula;
    ArrayList<MathList> almathlist;
    CustomAdapter caFormula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvFormula = findViewById(R.id.listViewFormula);

        almathlist = new ArrayList<>();

        MathList list1 = new MathList("Area of rectangle", "Length x length", "Formula type is: Area");
        MathList list2 = new MathList("Area of triangle", "(Length of base x Length) / 2", "Formula type is: Area");
        MathList list3 = new MathList("Volume of cube", "Length x Length x Length", "Formula type is: Volume");

        almathlist.add(list1);
        almathlist.add(list2);
        almathlist.add(list3);

        caFormula = new CustomAdapter(this, R.layout.mathlist, almathlist);

        lvFormula.setAdapter(caFormula);


    }
}
