package com.example.finalapp.model;

public class LoginResponse {
    private int id;
    private String message;
    private String token;
    private String status;
    private String photoUrl;
    private String att_maths;
    private String att_coa;
    private String att_vr;
    private String att_poe;
    private String att_dtm;
    private String att_os;
    private String att_os_lab;
    private String att_dsa;
    private String att_dsa_lab;
    private String att_app;
    private String name;
    private String stdId;
    private String regNo;
    private String email;
    private String tot_maths;
    private String tot_coa;
    private String tot_dsa;
    private String tot_dsa_lab;
    private String tot_os;
    private String tot_os_lab;
    private String tot_dtm;
    private String tot_poe;
    private String tot_vr;
    private String tot_app;

    public LoginResponse() {
    }

    public LoginResponse(String status, String message, int id, String att_maths, String att_coa, String att_dsa,
                         String att_dsa_lab, String att_os, String att_os_lab, String att_dtm, String att_poe,
                         String att_vr, String att_app, String name, String stdId, String regNo, String email,
                         String photoUrl, String tot_maths, String tot_coa, String tot_dsa, String tot_dsa_lab,
                         String tot_os, String tot_os_lab, String tot_dtm, String tot_poe, String tot_vr, String tot_app) {
        this.status = status;
        this.message = message;
        this.id = id;
        this.att_maths = att_maths;
        this.att_coa = att_coa;
        this.att_dsa = att_dsa;
        this.att_dsa_lab = att_dsa_lab;
        this.att_os = att_os;
        this.att_os_lab = att_os_lab;
        this.att_dtm = att_dtm;
        this.att_poe = att_poe;
        this.att_vr = att_vr;
        this.att_app = att_app;
        this.tot_maths = tot_maths;
        this.tot_coa = tot_coa;
        this.tot_dsa = tot_dsa;
        this.tot_dsa_lab = tot_dsa_lab;
        this.tot_os = tot_os;
        this.tot_os_lab = tot_os_lab;
        this.tot_dtm = tot_dtm;
        this.tot_poe = tot_poe;
        this.tot_vr = tot_vr;
        this.tot_app = tot_app;
        this.name = name;
        this.stdId = stdId;
        this.regNo = regNo;
        this.email = email;
        this.photoUrl = photoUrl;
    }

    // Getters and setters (optional)
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAtt_maths() {
        return att_maths;
    }

    public void setAtt_maths(String att_maths) {
        this.att_maths = att_maths;
    }

    public String getAtt_coa() {
        return att_coa;
    }

    public void setAtt_coa(String att_coa) {
        this.att_coa = att_coa;
    }

    public String getAtt_vr() {
        return att_vr;
    }

    public void setAtt_vr(String att_vr) {
        this.att_vr = att_vr;
    }

    public String getAtt_poe() {
        return att_poe;
    }

    public void setAtt_poe(String att_poe) {
        this.att_poe = att_poe;
    }

    public String getAtt_dtm() {
        return att_dtm;
    }

    public void setAtt_dtm(String att_dtm) {
        this.att_dtm = att_dtm;
    }

    public String getAtt_os() {
        return att_os;
    }

    public void setAtt_os(String att_os) {
        this.att_os = att_os;
    }

    public String getAtt_os_lab() {
        return att_os_lab;
    }

    public void setAtt_os_lab(String att_os_lab) {
        this.att_os_lab = att_os_lab;
    }

    public String getAtt_dsa() {
        return att_dsa;
    }

    public void setAtt_dsa(String att_dsa) {
        this.att_dsa = att_dsa;
    }

    public String getAtt_dsa_lab() {
        return att_dsa_lab;
    }

    public void setAtt_dsa_lab(String att_dsa_lab) {
        this.att_dsa_lab = att_dsa_lab;
    }

    public String getAtt_App() {
        return att_app;
    }

    public void setAtt_app(String att_app) {
        this.att_app = att_app;
    }

    public String getTot_maths() {
        return tot_maths;
    }

    public void setTot_maths(String tot_maths) {
        this.tot_maths = tot_maths;
    }

    public String getTot_coa() {
        return tot_coa;
    }

    public void setTot_coa(String tot_coa) {
        this.tot_coa = tot_coa;
    }

    public String getTot_dsa() {
        return tot_dsa;
    }

    public void setTot_dsa(String tot_dsa) {
        this.tot_dsa = tot_dsa;
    }

    public String getTot_dsa_lab() {
        return tot_dsa_lab;
    }

    public void setTot_dsa_lab(String tot_dsa_lab) {
        this.tot_dsa_lab = tot_dsa_lab;
    }

    public String getTot_dtm() {
        return tot_dtm;
    }

    public void setTot_dtm(String tot_dtm) {
        this.tot_dtm = tot_dtm;
    }

    public String getTot_os() {
        return tot_os;
    }

    public void setTot_os(String tot_os) {
        this.tot_os = tot_os;
    }

    public String getTot_os_lab() {
        return tot_os_lab;
    }

    public void setTot_os_lab(String tot_os_lab) {
        this.tot_os_lab = tot_os_lab;
    }

    public String getTot_poe() {
        return tot_poe;
    }

    public void setTot_poe(String tot_poe) {
        this.tot_poe = tot_poe;
    }

    public String getTot_vr() {
        return tot_vr;
    }

    public void setTot_vr(String tot_vr) {
        this.tot_vr = tot_vr;
    }

    public String getTot_app() {
        return tot_app;
    }

    public void setTot_app(String tot_app) {
        this.tot_app = tot_app;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStdId() {
        return stdId;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
}