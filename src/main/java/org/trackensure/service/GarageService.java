package org.trackensure.service;
import org.trackensure.config.DataSource;
import org.trackensure.dao.GarageDao;
import org.trackensure.entity.Garage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GarageService implements GarageDao {

    private Connection connection = DataSource.getConnection();

    public GarageService() throws SQLException {
    }

    @Override
    public List<Garage> getAll() throws SQLException {
        List<Garage> garageList = new ArrayList<>();

        String sql = "SELECT ID, NAME, COMPANY, CITY, COUNTRY FROM garage.garage";

        Statement statement = null;
        try {
            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Garage garage = new Garage();
                garage.setId(resultSet.getInt("ID"));
                garage.setName(resultSet.getString("NAME"));
                garage.setCompany(resultSet.getString("COMPANY"));
                garage.setCity(resultSet.getString("CITY"));
                garage.setCountry(resultSet.getString("COUNTRY"));

                garageList.add(garage);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return garageList;
    }
}
