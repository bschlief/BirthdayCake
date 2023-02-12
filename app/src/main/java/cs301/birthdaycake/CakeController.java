package cs301.birthdaycake;

import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {

    private CakeView cakeView;
    private CakeModel cakeModel;

    public CakeController(CakeView cakeView) {
        this.cakeView = cakeView;
        this.cakeModel = cakeView.getCakeModel();
    }

    @Override
    public void onClick(View v) {
        Log.d("schlief", String.format("Called CakeController::onClick -- %s", getViewResourceEntryName(v)));

        cakeModel.isCandlesLit = false;
        cakeView.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        Log.i("schlief", String.format("ButtonView = %s isChecked=%s", getViewResourceEntryName(buttonView), isChecked));

        cakeModel.hasCandles = isChecked;
        cakeView.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        cakeModel.numCandles = progress;
        cakeView.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
        // this space intentionally left blank
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
        // this space intentionally left blank
    }

    private String getViewResourceEntryName(View view) {
        return view.getResources().getResourceEntryName(view.getId());
    }


    private void whatever() {

        
    }
}
