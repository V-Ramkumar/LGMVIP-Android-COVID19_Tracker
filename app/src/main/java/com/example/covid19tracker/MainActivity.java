package com.example.covid19tracker;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    public static List<Model> modelList = new ArrayList<>();
    Model model;
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listy);
        fetchData();
    }
    private void fetchData() {
        String url = "https://data.covid19india.org/state_district_wise.json";
        StringRequest request = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject object = new JSONObject(response);
                    JSONObject object1 = object.getJSONObject("Tamil Nadu");
                    JSONObject object2 = object1.getJSONObject("districtData");
                    JSONObject object3 = object2.getJSONObject("Railway Quarantine");
                    JSONObject object4 = object3.getJSONObject("delta");


                    String active = object3.getString("active");
                    String confirmed = object3.getString("confirmed");
                    String deceased = object3.getString("deceased");
                    String recovered = object3.getString("recovered");

                    String confInc = object4.getString("confirmed");
                    String confDec = object4.getString("deceased");
                    String confRec = object4.getString("recovered");

                    model = new Model("Railway Quarantine", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);

                    modelList.add(model);


                    object3 = object2.getJSONObject("Airport Quarantine");


                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Airport Quarantine", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);

                    modelList.add(model);

                    object3 = object2.getJSONObject("Ariyalur");

                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");

                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Ariyalur", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);

                    modelList.add(model);


                    object3 = object2.getJSONObject("Chengalpattu");


                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Chengalpattu", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    modelList.add(model);

                    object3 = object2.getJSONObject("Chennai");


                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Chennai", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);

                    modelList.add(model);


                    object3 = object2.getJSONObject("Coimbatore");


                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Coimbatore", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);

                    modelList.add(model);


                    object3 = object2.getJSONObject("Cuddalore");


                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Cuddalore", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);

                    modelList.add(model);


                    object3 = object2.getJSONObject("Dharmapuri");


                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Dharmapuri", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);

                    modelList.add(model);

                    object3 = object2.getJSONObject("Dindigul");


                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Dindigul", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);

                    modelList.add(model);
                    object3 = object2.getJSONObject("Erode");


                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Erode", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    modelList.add(model);

                    object3 = object2.getJSONObject("Kallakurichi");


                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Kallakurichi", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    modelList.add(model);

                    object3 = object2.getJSONObject("Kancheepuram");


                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Kancheepuram", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    modelList.add(model);

                    object3 = object2.getJSONObject("Kanyakumari");


                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Kanyakumari", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    modelList.add(model);



                    object3 = object2.getJSONObject("Karur");


                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Karur", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    modelList.add(model);

                    object3 = object2.getJSONObject("Krishnagiri");


                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Krishnagiri", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    modelList.add(model);

                    object3 = object2.getJSONObject("Madurai");


                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Madurai", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    modelList.add(model);


                    object3 = object2.getJSONObject("Nagapattinam");


                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Nagapattinam", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    modelList.add(model);
                    object3 = object2.getJSONObject("Namakkal");


                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Namakkal", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    modelList.add(model);

                    object3 = object2.getJSONObject("Nilgiris");


                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Nilgiris", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    modelList.add(model);

                    object3 = object2.getJSONObject("Perambalur");


                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Perambalur", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    modelList.add(model);


                    object3 = object2.getJSONObject("Pudukkottai");


                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Pudukkottai", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    modelList.add(model);

                    object3 = object2.getJSONObject("Ramanathapuram");

                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Ramanathapuram", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    modelList.add(model);


                    object3 = object2.getJSONObject("Ranipet");

                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Ranipet", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    modelList.add(model);

                    object3 = object2.getJSONObject("Salem");

                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Salem", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    modelList.add(model);


                    object3 = object2.getJSONObject("Sivaganga");

                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Sivaganga", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    modelList.add(model);

                    object3 = object2.getJSONObject("Tenkasi");

                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Tenkasi", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    modelList.add(model);

                    object3 = object2.getJSONObject("Thanjavur");

                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Thanjavur", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    modelList.add(model);

                    object3 = object2.getJSONObject("Theni");

                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Theni", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    modelList.add(model);

                    object3 = object2.getJSONObject("Thiruvallur");

                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Thiruvallur", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    modelList.add(model);

                    object3 = object2.getJSONObject("Thiruvarur");

                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Thiruvarur", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    modelList.add(model);

                    object3 = object2.getJSONObject("Thoothukkudi");

                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Thoothukkudi", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    modelList.add(model);


                    object3 = object2.getJSONObject("Tiruchirappalli");

                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Tiruchirappalli", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    modelList.add(model);

                    object3 = object2.getJSONObject("Tirunelveli");

                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Tirunelveli", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    modelList.add(model);


                    object3 = object2.getJSONObject("Tirupathur");

                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Tirupathur", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    modelList.add(model);

                    object3 = object2.getJSONObject("Tiruppur");

                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Tiruppur", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    modelList.add(model);


                    object3 = object2.getJSONObject("Tiruvannamalai");

                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Tiruvannamalai", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    modelList.add(model);

                    object3 = object2.getJSONObject("Vellore");

                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Vellore", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    modelList.add(model);

                    object3 = object2.getJSONObject("Viluppuram");

                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Viluppuram", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    modelList.add(model);

                    object3 = object2.getJSONObject("Virudhunagar");

                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Virudhunagar", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    modelList.add(model);


                    object3 = object2.getJSONObject("Mayiladuthurai");

                    active = object3.getString("active");
                    confirmed = object3.getString("confirmed");
                    deceased = object3.getString("deceased");
                    recovered = object3.getString("recovered");
                    object4 = object3.getJSONObject("delta");
                    confInc = object4.getString("confirmed");
                    confDec = object4.getString("deceased");
                    confRec = object4.getString("recovered");

                    model = new Model("Mayiladuthurai", confirmed, deceased, recovered, active,
                            confInc, confDec, confRec);
                    modelList.add(model);

                    adapter = new Adapter(MainActivity.this, modelList);
                    listView.setAdapter(adapter);
                } catch (JSONException e) {
                    e.printStackTrace();
                }


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(MainActivity.this, error.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(request);
    }
}
