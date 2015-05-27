package co.edu.udea.schedulearning.matter;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import co.edu.udea.schedulearning.R;
import co.edu.udea.schedulearning.db.DB;

public class MatterRegisterFragment extends Fragment implements View.OnClickListener {
    private EditText editMatterName;
    private EditText editMatterWeight;
    private Button btnMatterRegister;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.matter_register, container, false);
        btnMatterRegister=(Button)view.findViewById(R.id.btnMatterRegister);
        btnMatterRegister.setOnClickListener(this);
        editMatterName= (EditText) view.findViewById(R.id.editMatterName);
        editMatterWeight= (EditText) view.findViewById(R.id.editMatterWeight);
        return view;
    }

    public void onClick(View view){
        Matter matter=new Matter(editMatterName.getText().toString(), Integer.parseInt(editMatterWeight.getText().toString()), 0);
        DB.get(this.getActivity()).save(matter);
        Toast.makeText(this.getActivity(), "Registro Exitoso", Toast.LENGTH_LONG).show();
    }
}