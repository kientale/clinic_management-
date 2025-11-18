package com.group11.project.clinicmanagement;

import com.formdev.flatlaf.FlatLightLaf;
import com.group11.project.clinicmanagement.controller.AuthController;

import javax.swing.*;
import java.awt.*;

public class ClinicManagementApplication {

    public static void main(String[] args) {
        setLookAndFeel();

        // Đảm bảo UI khởi động trên Event Dispatch Thread: Luồng chuyên xử lý UI trong Swing
        EventQueue.invokeLater(ClinicManagementApplication::launchApp);
    }

    private static void launchApp() {
    		// Tạo Controller và khởi tạo View login
        AuthController authController = new AuthController(); 
        authController.showLoginView();
    }

    // Look and Feel FlatLightLaf
    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            System.err.println("❌ Unable to apply FlatLaf look and feel: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
