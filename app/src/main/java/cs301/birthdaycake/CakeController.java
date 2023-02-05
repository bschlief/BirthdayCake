package cs301.birthdaycake;

import android.util.Log;
import android.view.View;

public class CakeController implements View.OnClickListener {

    private CakeView cakeView;
    private CakeModel cakeModel;

    public CakeController(CakeView cakeView) {
        this.cakeView = cakeView;
        this.cakeModel = cakeView.getCakeModel();
    }

    @Override
    public void onClick(View v) {
        Log.d("schlief", String.format("Called CakeController::onClick -- %s", v));

        cakeModel.isCandlesLit = false;
        cakeView.invalidate();
    }
}
