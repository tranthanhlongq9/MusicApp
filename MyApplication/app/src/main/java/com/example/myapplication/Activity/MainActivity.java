package com.example.myapplication.Activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.myapplication.Adapter.MainViewPagerAdapter;
import com.example.myapplication.Fragment.Fragment_Tim_kiem;
import com.example.myapplication.Fragment.Fragment_Trang_Chu;
import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    Toolbar toolbar;
//    NavigationView navigationView;
//    ListView listViewmanhinhchinh;
    DrawerLayout drawerLayout;
//    ArrayList<Menu> mangmenu;
//    MenuAdapter menuAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        init();
        ActionBar();
    }

    private void ActionBar() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        toolbar.setNavigationIcon(android.R.drawable.ic_menu_sort_by_size);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
    }

    private void init() {
        MainViewPagerAdapter mainViewPagerAdapter = new MainViewPagerAdapter(getSupportFragmentManager());
        mainViewPagerAdapter.addFragment(new Fragment_Trang_Chu(), "Trang Chủ");
        mainViewPagerAdapter.addFragment(new Fragment_Tim_kiem(), "Tìm Kiếm");
        viewPager.setAdapter(mainViewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
//        tabLayout.getTabAt(0).setIcon(R.drawable.icontrangchu);
//        tabLayout.getTabAt(1).setIcon(R.drawable.iconsearch);
    }

    private void anhxa() {
        tabLayout = findViewById(R.id.myTabLayout);
        viewPager = findViewById(R.id.myViewPager);
        toolbar = findViewById(R.id.toolbarmanhinhchinh);
//        navigationView = findViewById(R.id.navigationviewhome);
//        listViewmanhinhchinh = findViewById(R.id.listviewmanhinhhome);
        drawerLayout = findViewById(R.id.drawerlayout);

//        mangmenu = new ArrayList<>();
//        mangmenu.add(0,new Menu(0,"Đăng Nhập","https://image.flaticon.com/icons/svg/825/825168.svg"));
//
//        menuAdapter = new MenuAdapter(mangmenu,getApplicationContext());
//        listViewmanhinhchinh.setAdapter(menuAdapter);


    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_demo,menu);
//
//        return super.onCreateOptionsMenu(menu);
//    }


}
