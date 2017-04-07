package th.co.thekhaeng.materialstyletemplate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import th.co.thekhaeng.materialstyletemplate.adapter.ItemCreator;
import th.co.thekhaeng.materialstyletemplate.adapter.MaterialGuidelineAdapter;

public class MainActivity extends AppCompatActivity{

    private RecyclerView rvMaterial;
    private MaterialGuidelineAdapter adapter;

    @Override
    protected void onCreate( Bundle savedInstanceState ){
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        adapter = new MaterialGuidelineAdapter( ItemCreator.createItem());

        rvMaterial = (RecyclerView) findViewById( R.id.rv_material );
        rvMaterial.setLayoutManager( new LinearLayoutManager( this ) );
        rvMaterial.setAdapter( adapter );
    }
}
