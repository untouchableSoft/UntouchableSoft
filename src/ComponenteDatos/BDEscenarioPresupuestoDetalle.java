package ComponenteDatos;

import ComponenteClase.EscenarioPresupuestoDetalle;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public abstract class BDEscenarioPresupuestoDetalle {
    public static void insertarEscenarioPresupuestoDetalle(EscenarioPresupuestoDetalle EPD) throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ps = cnn.prepareStatement(  "INSERT INTO escenariopresupuestodetalle(EscenarioPresupuestoMontoSolicitado,\n" +
                                    "EscenarioPresupuestoMontoAprobado, EscenarioPresupuestoMontoEjecutado,\n" +
                                    "EscearioPresupuestoId, PeriodoContableCodigo, AcapitePresupuestalCodigo)\n" +
                                    "VALUES (?,?,?,?,?,?)");
        ps.setDouble(1, EPD.getMontoSolicitado());
        ps.setDouble(2, EPD.getMontoAprobado());
        ps.setDouble(3, EPD.getMontoEjecutado());
        ps.setInt(4, EPD.getIdEscenarioPresupuesto().getIdEscenarioPresupuesto());
        ps.setString(5, EPD.getCodPeriodoContable().getCodPeriodoContable());
        ps.setInt(6, EPD.getCodAcapitePresupuestal().getCodAcapitePresupuestal());
        ps.executeUpdate();
        cnn.close();
        ps.close();
    }
    
    public static ArrayList<EscenarioPresupuestoDetalle> mostrarEscenarioPresupuesto() throws SQLException {
        Connection cnn = BD.getConnection();
        PreparedStatement ps = null;
        ArrayList<EscenarioPresupuestoDetalle> lista = new ArrayList<EscenarioPresupuestoDetalle>();

        ps = cnn.prepareStatement(  "SELECT EscenarioPresupuestoMontoSolicitado, EscenarioPresupuestoMontoAprobado,\n" +
                                    "EscenarioPresupuestoMontoEjecutado, EscearioPresupuestoId,\n" +
                                    "PeriodoContableCodigo, AcapitePresupuestalCodigo\n" +
                                    "FROM escenariopresupuestodetalle ");
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
           EscenarioPresupuestoDetalle c = new EscenarioPresupuestoDetalle() {};
            c.setCodAcapitePresupuestal(BDAcapitePresupuestal.buscarAcapitePresupuestal(rs.getString("AcapitePresupuestalCodigo")));
            c.setCodPeriodoContable(BDPeriodoContable.buscarPeriodoContable(rs.getString("PeriodoContableCodigo")));
            c.setIdEscenarioPresupuesto(BDEscenarioPresupuesto.buscarEscenarioPresupuesto(rs.getInt("EscearioPresupuestoId")));
            c.setMontoAprobado(rs.getDouble("EscenarioPresupuestoMontoAprobado"));
            c.setMontoEjecutado(rs.getDouble("EscenarioPresupuestoMontoEjecutado"));
            c.setMontoSolicitado(rs.getDouble("EscenarioPresupuestoMontoSolicitado"));
            lista.add(c);
        }
        cnn.close();
        ps.close();
        return lista;
    }
}
