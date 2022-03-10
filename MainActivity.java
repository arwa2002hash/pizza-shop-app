    package com.example.intent;

    import androidx.appcompat.app.AppCompatActivity;
    import androidx.recyclerview.widget.LinearLayoutManager;
    import androidx.recyclerview.widget.RecyclerView;


    import android.os.Bundle;
    import android.widget.Button;

    import com.example.intent.R;

    import java.util.ArrayList;


    public class MainActivity extends AppCompatActivity {
        private RecyclerView.Adapter adapter,adapter2;
        private RecyclerView recyclerViewCategoryList,recyclerViewPopularList;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                recyclerViewCategory();
                recyclerViewPopularList();




            }

        private void recyclerViewPopularList() {


         LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this , LinearLayoutManager.HORIZONTAL,false);
         recyclerViewPopularList.findViewById(R.id.res_view2);
         recyclerViewPopularList.setLayoutManager(linearLayoutManager);

         ArrayList<FoodDomain> foodlist= new ArrayList<>();
         foodlist.add(new FoodDomain("Buffalo pizza","pizza1",9.76));
            foodlist.add(new FoodDomain("Margherita pizza", "pizza2" ,8.79));
            foodlist.add(new FoodDomain("cheese pizza","pizza3" ,8.5));
            foodlist.add(new FoodDomain("Pepperoni pizza","pizza4" ,9.5));


         adapter2 = new Popular(foodlist);
         recyclerViewPopularList.setAdapter(adapter2);


        }

        private void recyclerViewCategory() {



                    LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this ,LinearLayoutManager.HORIZONTAL,false);

                    recyclerViewCategoryList.findViewById(R.id.res_view1);
                    recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

                    ArrayList<CategoryDomain> categryList = new ArrayList<>();
                    categryList.add(new CategoryDomain("Pizza", "cat_1"));
                    categryList.add(new CategoryDomain("Burger", "cat_2"));
                    categryList.add(new CategoryDomain("HotDog", "cat_3"));
                    categryList.add(new CategoryDomain("SoftDrink", "cat_4"));
                    categryList.add(new CategoryDomain("frenchFries", "cat_5"));


                    adapter = new Category(categryList);
                    recyclerViewCategoryList.setAdapter(adapter);


            }


            }

















