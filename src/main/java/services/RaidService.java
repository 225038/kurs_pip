package services;

import domain.Raid;

public interface RaidService {
    void remove(int id);
    Iterable<Raid> findAll();
    Raid find(String name);
    void delete(Raid status);
    void save(Raid status);
    void updateStatus(String status, int id);
}
