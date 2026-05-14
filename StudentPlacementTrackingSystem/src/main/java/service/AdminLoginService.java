package service;

import model.AdminLoginModel;
import repository.AdminLoginRepositoryImpl;
import repository.AdminLoginRepository;

import repository.DBConfig;

public class AdminLoginService implements AdminLoginServiceImpl {
    
    AdminLoginRepository repo = new AdminLoginRepositoryImpl();

    @Override
    public boolean isAdminLogin(AdminLoginModel adminLogin) {
        return repo.isAddminLogin(adminLogin); // Call the REPO method
    }
}