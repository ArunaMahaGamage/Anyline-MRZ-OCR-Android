package io.anyline.examples.ocr;

import android.os.Bundle;

import at.nineyards.anyline.modules.ocr.AnylineOcrConfig;

public class ScanLicensePlateGermanyActivity extends ScanLicensePlateActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // see {@link ScanLicensePlateActivity} for details
        AnylineOcrConfig anylineOcrConfig = new AnylineOcrConfig();
        anylineOcrConfig.setCustomCmdFile("license_plates_d.ale");

        scanView.setAnylineOcrConfig(anylineOcrConfig);
    }
}
