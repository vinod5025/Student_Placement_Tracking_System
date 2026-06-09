package service;

import repository.UpdatePlacementStatusRepositoryImpl;

public class UpdatePlacementStatusServiceImpl
        implements UpdatePlacementStatusService {

    UpdatePlacementStatusRepositoryImpl ur =
            new UpdatePlacementStatusRepositoryImpl();

    @Override
    public boolean updateStatus(int id,
            String status) {

        return ur.updateStatus(id, status);
    }
}