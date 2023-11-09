package com.example.finalapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class AttendanceFragment extends Fragment {
    private static final String ARG_ATTENDANCE_DATA_MATHS = "argAttendanceDataMaths";
    private static final String ARG_TOTAL_CLASS_DATA_MATHS = "argTotalClassDataMaths";
    private static final String ARG_ATTENDANCE_DATA_COA = "argAttendanceDataCoa";
    private static final String ARG_TOTAL_CLASS_DATA_COA = "argTotalClassDataCoa";
    private static final String ARG_ATTENDANCE_DATA_OS = "argAttendanceDataOs";
    private static final String ARG_TOTAL_CLASS_DATA_OS = "argTotalClassDataOs";
    private static final String ARG_ATTENDANCE_DATA_OSLAB = "argAttendanceDataOsLab";
    private static final String ARG_TOTAL_CLASS_DATA_OSLAB = "argTotalClassDataOsLab";
    private static final String ARG_ATTENDANCE_DATA_DSA = "argAttendanceDataDsa";
    private static final String ARG_TOTAL_CLASS_DATA_DSA = "argTotalClassDataDsa";
    private static final String ARG_ATTENDANCE_DATA_DSALAB = "argAttendanceDataDsLab";
    private static final String ARG_TOTAL_CLASS_DATA_DSALAB = "argTotalClassDataDsLab";
    private static final String ARG_ATTENDANCE_DATA_DTM = "argAttendanceDataDtm";
    private static final String ARG_TOTAL_CLASS_DATA_DTM = "argTotalClassDataDtm";
    private static final String ARG_ATTENDANCE_DATA_POE = "argAttendanceDataPoe";
    private static final String ARG_TOTAL_CLASS_DATA_POE = "argTotalClassDataPoe";
    private static final String ARG_ATTENDANCE_DATA_VR = "argAttendanceDataVr";
    private static final String ARG_TOTAL_CLASS_DATA_VR = "argTotalClassDataVr";
    private static final String ARG_ATTENDANCE_DATA_APP = "argAttendanceDataApp";
    private static final String ARG_TOTAL_CLASS_DATA_APP = "argTotalClassDataApp";

    public AttendanceFragment() {
        // Required empty public constructor
    }

    public static AttendanceFragment newInstance(String maths, String coa, String os, String osLab, String dsa, String dsaLab, String dtm, String app, String poe, String vr, String totMaths, String totCoa, String totDsa, String totDsaLab, String totOs, String totOsLab, String totDtm, String totPoe, String totVr, String totApp) {
        AttendanceFragment fragment = new AttendanceFragment();
        Bundle args = new Bundle();

        args.putString(ARG_ATTENDANCE_DATA_MATHS, maths);
        args.putString(ARG_TOTAL_CLASS_DATA_MATHS, totMaths);

        args.putString(ARG_ATTENDANCE_DATA_COA, coa);
        args.putString(ARG_TOTAL_CLASS_DATA_COA, totCoa);

        args.putString(ARG_ATTENDANCE_DATA_OS, os);
        args.putString(ARG_TOTAL_CLASS_DATA_OS, totOs);

        args.putString(ARG_ATTENDANCE_DATA_OSLAB, osLab);
        args.putString(ARG_TOTAL_CLASS_DATA_OSLAB, totOsLab);

        args.putString(ARG_ATTENDANCE_DATA_DSA, dsa);
        args.putString(ARG_TOTAL_CLASS_DATA_DSA, totDsa);

        args.putString(ARG_ATTENDANCE_DATA_DSALAB, dsaLab);
        args.putString(ARG_TOTAL_CLASS_DATA_DSALAB, totDsaLab);

        args.putString(ARG_ATTENDANCE_DATA_DTM, dtm);
        args.putString(ARG_TOTAL_CLASS_DATA_DTM, totDtm);

        args.putString(ARG_ATTENDANCE_DATA_APP, app);
        args.putString(ARG_TOTAL_CLASS_DATA_APP, totApp);

        args.putString(ARG_ATTENDANCE_DATA_POE, poe);
        args.putString(ARG_TOTAL_CLASS_DATA_POE, totPoe);

        args.putString(ARG_ATTENDANCE_DATA_VR, vr);
        args.putString(ARG_TOTAL_CLASS_DATA_VR, totVr);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_attendance, container, false);

        populateSubject(view, ARG_ATTENDANCE_DATA_MATHS, ARG_TOTAL_CLASS_DATA_MATHS, R.id.tot_class_maths, R.id.attendance_maths, R.id.attended_maths, R.id.required_maths, R.id.margin_maths, R.id.card_maths);
        populateSubject(view, ARG_ATTENDANCE_DATA_COA, ARG_TOTAL_CLASS_DATA_COA, R.id.tot_class_coa, R.id.attendance_coa, R.id.attended_coa, R.id.required_coa, R.id.margin_coa, R.id.card_coa);
        populateSubject(view, ARG_ATTENDANCE_DATA_OS, ARG_TOTAL_CLASS_DATA_OS, R.id.tot_class_os, R.id.attendance_os, R.id.attended_os, R.id.required_os, R.id.margin_os, R.id.card_os);
        populateSubject(view, ARG_ATTENDANCE_DATA_OSLAB, ARG_TOTAL_CLASS_DATA_OSLAB, R.id.tot_class_os_lab, R.id.attendance_os_lab, R.id.attended_os_lab, R.id.required_os_lab, R.id.margin_os_lab, R.id.card_os_lab);
        populateSubject(view, ARG_ATTENDANCE_DATA_DSA, ARG_TOTAL_CLASS_DATA_DSA, R.id.tot_class_dsa, R.id.attendance_dsa, R.id.attended_dsa, R.id.required_dsa, R.id.margin_dsa, R.id.card_dsa);
        populateSubject(view, ARG_ATTENDANCE_DATA_DSALAB, ARG_TOTAL_CLASS_DATA_DSALAB, R.id.tot_class_dsa_lab, R.id.attendance_dsa_lab, R.id.attended_dsa_lab, R.id.required_dsa_lab, R.id.margin_dsa_lab, R.id.card_dsa_lab);
        populateSubject(view, ARG_ATTENDANCE_DATA_DTM, ARG_TOTAL_CLASS_DATA_DTM, R.id.tot_class_dtm, R.id.attendance_dtm, R.id.attended_dtm, R.id.required_dtm, R.id.margin_dtm, R.id.card_dtm);
        populateSubject(view, ARG_ATTENDANCE_DATA_POE, ARG_TOTAL_CLASS_DATA_POE, R.id.tot_class_poe, R.id.attendance_poe, R.id.attended_poe, R.id.required_poe, R.id.margin_poe, R.id.card_poe);
        populateSubject(view, ARG_ATTENDANCE_DATA_VR, ARG_TOTAL_CLASS_DATA_VR, R.id.tot_class_vr, R.id.attendance_vr, R.id.attended_vr, R.id.required_vr, R.id.margin_vr, R.id.card_vr);
        populateSubject(view, ARG_ATTENDANCE_DATA_APP, ARG_TOTAL_CLASS_DATA_APP, R.id.tot_class_app, R.id.attendance_app, R.id.attended_app, R.id.required_app, R.id.margin_app, R.id.card_app);

        return view;
    }

    private void populateSubject(View view, String attendanceDataKey, String totalClassDataKey, int totalClassResId, int attendanceResId, int attendedResId, int requiredResId, int marginResId, int cardId) {
        Bundle args = getArguments();
        if (args != null) {
            String attendanceData = args.getString(attendanceDataKey);
            String totalClassData = args.getString(totalClassDataKey);

            TextView totClassTextView = view.findViewById(totalClassResId);
            TextView attendanceTextView = view.findViewById(attendanceResId);
            TextView attendedTextView = view.findViewById(attendedResId);
            TextView requiredTextView = view.findViewById(requiredResId);
            TextView marginTextView = view.findViewById(marginResId);
            CardView cardView = view.findViewById(cardId);

            if (attendanceData != null && totalClassData != null) {
                double total = Double.parseDouble(totalClassData);
                double att = Double.parseDouble(attendanceData);

                totClassTextView.setText(totalClassData);
                attendanceTextView.setText(attendanceData);

                double attendedDouble = total_attended(att, total);
                int attended = (int) Math.round(attendedDouble);
                attendedTextView.setText(String.valueOf(attended));

                int required = required(total, att, attended);
                requiredTextView.setText(String.valueOf(required));

                int margin = margin(total, att, attended);
                marginTextView.setText(String.valueOf(margin));

                // Check if required is 0 and margin is 0, then set brown background
                if (required == 0 && margin == 0) {
                    cardView.setBackgroundColor(getResources().getColor(R.color.banner)); // Brown color
                } else if (required == 0) {
                    cardView.setCardBackgroundColor(getResources().getColor(R.color.lightGreen)); // Green color
                } else if (margin == 0) {
                    cardView.setCardBackgroundColor(getResources().getColor(R.color.red)); // Red color
                } else {
                    cardView.setCardBackgroundColor(getResources().getColor(android.R.color.white)); // White color (or any other default color)
                }
            } else {
                totClassTextView.setText("");
                attendanceTextView.setText("");
                attendedTextView.setText("");
                requiredTextView.setText("");
                marginTextView.setText("");

                cardView.setCardBackgroundColor(getResources().getColor(android.R.color.white)); // White color (or any other default color)
            }
        }
    }

    public double total_attended(double attendance, double total_classes) {
        return (attendance * total_classes) / 100;
    }

    public int required(double total_classes, double att, int present) {
        if (att < 75) return (75 * (int) total_classes - 100 * present) / 25;
        else return 0;
    }

    public int margin(double total_classes, double att, int present) {
        if (att > 75) return (present * 100 - 75 * (int) total_classes) / 75;
        else return 0;
    }
}