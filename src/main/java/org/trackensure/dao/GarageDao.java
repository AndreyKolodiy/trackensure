package org.trackensure.dao;

import org.trackensure.entity.Garage;

import java.sql.SQLException;
import java.util.List;

public interface GarageDao {

    List<Garage> getAll() throws SQLException;
}
