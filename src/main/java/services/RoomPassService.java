package services;

import domain.RoomPass;

public interface RoomPassService {

    void remove(int id);
    Iterable<RoomPass> findAll();
    RoomPass find(String name);
    void delete(RoomPass pass);
    void save(RoomPass pass);
    void updateStatus(String pass, int id);
}
