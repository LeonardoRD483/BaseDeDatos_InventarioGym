/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafica;

import Conexion.Queries;
import dao.FactoryDao;
import java.io.IOException;
import java.sql.Date;
import java.util.Calendar;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import tablas.*;

/**
 *
 * @author JOSE LUIS
 */
public class Ventana extends javax.swing.JFrame {

    private FactoryDao factory;
    private Queries q;

    //private BufferedImage imagen;
    public Ventana() throws IOException {
        initComponents();
        this.setLocationRelativeTo(null);
        factory = FactoryDao.getFactory();
        q = new Queries();
        //imagen = ImageIO.read(Ventana.class.getResource("/boton-salir-png-5.png"));

    }

    private void listaClientes() {
        List<Cliente> clientitos = factory.getClientesDao().get();
        String[] columns = {"Codigo", "Nombre", "Apellidos", "Fecha", "Usuario", "Contra"};
        Object[] obj = new Object[6];
        DefaultTableModel modelo = new DefaultTableModel(columns, 0);
        modelo.setNumRows(0);
        for (int i = 0; i < clientitos.size(); i++) {
            obj[0] = clientitos.get(i).getCodigo();
            obj[1] = clientitos.get(i).getNombre();
            obj[2] = clientitos.get(i).getApellidos();
            obj[3] = clientitos.get(i).getFecha();
            obj[4] = clientitos.get(i).getUsuario();
            obj[5] = clientitos.get(i).getContra();
            modelo.addRow(obj);
        }
        TablaClientes.setModel(modelo);
    }

    private void listaProductos() {
        List<Producto> productitos = factory.getProductosDao().get();
        String[] columns = {"Codigo", "Nombre", "Precio", "IMG"};
        Object[] obj = new Object[4];
        DefaultTableModel modelo = new DefaultTableModel(columns, 0);
        modelo.setNumRows(0);
        for (int i = 0; i < productitos.size(); i++) {
            obj[0] = productitos.get(i).getCodigo();
            obj[1] = productitos.get(i).getNombre();
            obj[2] = productitos.get(i).getPrecio();
            obj[3] = "Imagencita";

            modelo.addRow(obj);
        }
        TablaProductos.setModel(modelo);

    }

    private void listaEmpleados() {
        List<Empleado> empleaditos = factory.getEmpleadosDao().get();
        String[] columns = {"Codigo", "Nombre", "Apellido", "Fecha", "Usuario", "Salario"};
        Object[] obj = new Object[6];
        DefaultTableModel modelo = new DefaultTableModel(columns, 0);
        modelo.setNumRows(0);
        for (int i = 0; i < empleaditos.size(); i++) {
            obj[0] = empleaditos.get(i).getCodigo();
            obj[1] = empleaditos.get(i).getNombre();
            obj[2] = empleaditos.get(i).getApellidos();
            obj[3] = empleaditos.get(i).getFecha();
            obj[4] = empleaditos.get(i).getUsuario();
            obj[5] = empleaditos.get(i).getSalario();

            modelo.addRow(obj);
        }
        TablaAdmin.setModel(modelo);
    }

    //ins_upd_empleado(fecha_nac date, snombre text, sapellido text,
    //carnet text,surcusal int,labor text,Salario decimal(9,2))
    private void insertar_actualizar_empleado(Empleado e) {
        q.insertar_actualizar_empleado(e);
    }

    //ins_upd_cliente(fecha_nac date, snombre text, sapellido text,
    //carnet text,surcusal int,permitido boolean)
    public void insertar_actualizar_cliente(Cliente c) {
        q.insertar_actualizar_cliente(c);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelInicio = new javax.swing.JPanel();
        btnReg = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnEmpleados = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PanelRegistrarClientes = new javax.swing.JPanel();
        btnAtrasRegistroClientes = new javax.swing.JButton();
        txtApellidoReg = new javax.swing.JTextField();
        comboDiaCliente = new javax.swing.JComboBox<>();
        comboMesCliente = new javax.swing.JComboBox<>();
        ComboAnhoCliente = new javax.swing.JComboBox<>();
        lblCIReg2 = new javax.swing.JLabel();
        lblApellidoReg = new javax.swing.JLabel();
        lblCIReg = new javax.swing.JLabel();
        txtCorreoReg = new javax.swing.JTextField();
        lblCorreroReg = new javax.swing.JLabel();
        txtCIReg = new javax.swing.JTextField();
        CheckBoxPermitido = new javax.swing.JCheckBox();
        lblNombreReg = new javax.swing.JLabel();
        txtNombreReg = new javax.swing.JTextField();
        btnRegCliente = new javax.swing.JButton();
        lblSucursalClientes = new javax.swing.JLabel();
        ComboRegistroClientes = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        PanelClientes = new javax.swing.JPanel();
        btnAtrasClientes = new javax.swing.JButton();
        btnBuscarCliente = new javax.swing.JButton();
        ScrollClientes = new javax.swing.JScrollPane();
        TablaClientes = new javax.swing.JTable();
        txtBuscarCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PanelEmpleados = new javax.swing.JPanel();
        btnRegistrarEntrada = new javax.swing.JButton();
        btnAtrasEmpleados = new javax.swing.JButton();
        txtPassEntrada = new javax.swing.JPasswordField();
        jScrollEmpleados = new javax.swing.JScrollPane();
        TablaEmpleados = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        PanelProductos = new javax.swing.JPanel();
        txtBuscarProducto = new javax.swing.JTextField();
        btnBuscarProducto = new javax.swing.JButton();
        btnAtrasProductos = new javax.swing.JButton();
        jScrollProductos = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        PanelAdministrador = new javax.swing.JPanel();
        btnSalirAdministrador = new javax.swing.JButton();
        btnRegAdministrador = new javax.swing.JButton();
        btnEmpleados1 = new javax.swing.JButton();
        btnBuscarAdministrador = new javax.swing.JButton();
        btnProductos1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        PanelRegistrarEmpleados = new javax.swing.JPanel();
        btnSalirAdministrador1 = new javax.swing.JButton();
        txtNombreRegAdmin = new javax.swing.JTextField();
        txtApellidoRegAdmin = new javax.swing.JTextField();
        txtCorreoRegAdmin = new javax.swing.JTextField();
        txtSalarioRegistroEmpleado = new javax.swing.JTextField();
        txtCIRegAdmin = new javax.swing.JTextField();
        ComboAnhoEmpleado = new javax.swing.JComboBox<>();
        ComboMesEmpleado = new javax.swing.JComboBox<>();
        ComboDiaEmpleado = new javax.swing.JComboBox<>();
        ComboRegistroEmpleado = new javax.swing.JComboBox<>();
        lblSalario = new javax.swing.JLabel();
        lblSucursalEmpleados = new javax.swing.JLabel();
        lblCIReg3 = new javax.swing.JLabel();
        lblApellidoReg1 = new javax.swing.JLabel();
        lblCIReg1 = new javax.swing.JLabel();
        lblCorreroReg1 = new javax.swing.JLabel();
        lblNombreReg1 = new javax.swing.JLabel();
        btnRegEmpleado = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        PanelBuscarAdmin = new javax.swing.JPanel();
        btnBuscarAdmin = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboAnhoAdmin = new javax.swing.JComboBox<>();
        btnSalirAdministrador2 = new javax.swing.JButton();
        txtNombreRegAdmin1 = new javax.swing.JTextField();
        ScrollAdmin = new javax.swing.JScrollPane();
        TablaAdmin = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        PanelAnhadirProductoAdmin = new javax.swing.JPanel();
        btnAnhadirProductoAdmin = new javax.swing.JButton();
        btnSalirProductoAdmin = new javax.swing.JButton();
        txtNombreAnhadirProductoAdmin = new javax.swing.JTextField();
        lblNombreReg2 = new javax.swing.JLabel();
        lblCorreroReg2 = new javax.swing.JLabel();
        txtPrecioProductoAdmin = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        PanelLogin = new javax.swing.JPanel();
        lblPass = new javax.swing.JLabel();
        txtPass = new javax.swing.JPasswordField();
        btnExit = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        txtUser = new javax.swing.JTextField();
        lblUser = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblFondoBase = new javax.swing.JLabel();

        PanelInicio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnReg.setBackground(new java.awt.Color(0, 0, 0));
        btnReg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnReg.setForeground(new java.awt.Color(255, 255, 255));
        btnReg.setText("Registrar Cliente");
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });
        PanelInicio.add(btnReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 150, 40));

        btnSalir.setBackground(new java.awt.Color(0, 0, 0));
        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        PanelInicio.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 90, 30));

        btnBuscar.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Cliente");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        PanelInicio.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 150, 40));

        btnEmpleados.setBackground(new java.awt.Color(0, 0, 0));
        btnEmpleados.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpleados.setText("Empleados");
        btnEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadosActionPerformed(evt);
            }
        });
        PanelInicio.add(btnEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 150, 40));

        btnProductos.setBackground(new java.awt.Color(0, 0, 0));
        btnProductos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnProductos.setText("Productos");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        PanelInicio.add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 150, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        PanelInicio.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bw-background-1.jpg"))); // NOI18N
        PanelInicio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 440));

        PanelRegistrarClientes.setMinimumSize(new java.awt.Dimension(780, 443));
        PanelRegistrarClientes.setPreferredSize(new java.awt.Dimension(780, 443));
        PanelRegistrarClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAtrasRegistroClientes.setBackground(new java.awt.Color(0, 0, 0));
        btnAtrasRegistroClientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAtrasRegistroClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnAtrasRegistroClientes.setText("Atras");
        btnAtrasRegistroClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasRegistroClientesActionPerformed(evt);
            }
        });
        PanelRegistrarClientes.add(btnAtrasRegistroClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 90, 30));
        PanelRegistrarClientes.add(txtApellidoReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 200, -1));

        comboDiaCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        PanelRegistrarClientes.add(comboDiaCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 50, -1));

        comboMesCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        PanelRegistrarClientes.add(comboMesCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 50, -1));

        ComboAnhoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboAnhoClienteActionPerformed(evt);
            }
        });
        PanelRegistrarClientes.add(ComboAnhoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 70, -1));

        lblCIReg2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCIReg2.setForeground(new java.awt.Color(255, 255, 255));
        lblCIReg2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCIReg2.setText("Fecha nacimiento:");
        PanelRegistrarClientes.add(lblCIReg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 140, -1));

        lblApellidoReg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblApellidoReg.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidoReg.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblApellidoReg.setText("Apellido:");
        PanelRegistrarClientes.add(lblApellidoReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 70, -1));

        lblCIReg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCIReg.setForeground(new java.awt.Color(255, 255, 255));
        lblCIReg.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCIReg.setText("CI:");
        PanelRegistrarClientes.add(lblCIReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 70, -1));
        PanelRegistrarClientes.add(txtCorreoReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 200, -1));

        lblCorreroReg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCorreroReg.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreroReg.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCorreroReg.setText("Correo:");
        PanelRegistrarClientes.add(lblCorreroReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 70, -1));
        PanelRegistrarClientes.add(txtCIReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 200, -1));

        CheckBoxPermitido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CheckBoxPermitido.setText("Ingreso a otras sucursales");
        CheckBoxPermitido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxPermitidoActionPerformed(evt);
            }
        });
        PanelRegistrarClientes.add(CheckBoxPermitido, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        lblNombreReg.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombreReg.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreReg.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreReg.setText("Nombre:");
        PanelRegistrarClientes.add(lblNombreReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 70, -1));
        PanelRegistrarClientes.add(txtNombreReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 200, -1));

        btnRegCliente.setBackground(new java.awt.Color(0, 0, 0));
        btnRegCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnRegCliente.setText("Registrar");
        btnRegCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegClienteActionPerformed(evt);
            }
        });
        PanelRegistrarClientes.add(btnRegCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 110, -1));

        lblSucursalClientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSucursalClientes.setForeground(new java.awt.Color(255, 255, 255));
        lblSucursalClientes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSucursalClientes.setText("Sucursal:");
        PanelRegistrarClientes.add(lblSucursalClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 140, -1));

        PanelRegistrarClientes.add(ComboRegistroClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 50, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        PanelRegistrarClientes.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bw-background-1.jpg"))); // NOI18N
        PanelRegistrarClientes.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 440));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bw-background-1.jpg"))); // NOI18N
        PanelRegistrarClientes.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 440));

        PanelClientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAtrasClientes.setBackground(new java.awt.Color(0, 0, 0));
        btnAtrasClientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAtrasClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnAtrasClientes.setText("Atras");
        btnAtrasClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasClientesActionPerformed(evt);
            }
        });
        PanelClientes.add(btnAtrasClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 90, 30));

        btnBuscarCliente.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscarCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarCliente.setText("Buscar Cliente");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });
        PanelClientes.add(btnBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 160, 30));

        ScrollClientes.setBackground(new java.awt.Color(102, 102, 102));
        ScrollClientes.setBorder(null);

        TablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Apellidos", "CI", "Paquete", "Vigencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrollClientes.setViewportView(TablaClientes);

        PanelClientes.add(ScrollClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 740, 260));

        txtBuscarCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarClienteActionPerformed(evt);
            }
        });
        PanelClientes.add(txtBuscarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 460, 30));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        PanelClientes.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bw-background-1.jpg"))); // NOI18N
        PanelClientes.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 440));

        PanelEmpleados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrarEntrada.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistrarEntrada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegistrarEntrada.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarEntrada.setText("Registrar entrada");
        btnRegistrarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEntradaActionPerformed(evt);
            }
        });
        PanelEmpleados.add(btnRegistrarEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 160, 30));

        btnAtrasEmpleados.setBackground(new java.awt.Color(0, 0, 0));
        btnAtrasEmpleados.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAtrasEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        btnAtrasEmpleados.setText("Atras");
        btnAtrasEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasEmpleadosActionPerformed(evt);
            }
        });
        PanelEmpleados.add(btnAtrasEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 90, 30));

        txtPassEntrada.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PanelEmpleados.add(txtPassEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 160, 30));

        jScrollEmpleados.setBackground(new java.awt.Color(102, 102, 102));
        jScrollEmpleados.setBorder(null);

        TablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Apellidos", "Labor", "Entrada", "Salida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollEmpleados.setViewportView(TablaEmpleados);
        if (TablaEmpleados.getColumnModel().getColumnCount() > 0) {
            TablaEmpleados.getColumnModel().getColumn(2).setHeaderValue("Apellidos");
            TablaEmpleados.getColumnModel().getColumn(3).setHeaderValue("Labor");
            TablaEmpleados.getColumnModel().getColumn(4).setHeaderValue("Entrada");
            TablaEmpleados.getColumnModel().getColumn(5).setHeaderValue("Salida");
        }

        PanelEmpleados.add(jScrollEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 740, 260));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        PanelEmpleados.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bw-background-1.jpg"))); // NOI18N
        PanelEmpleados.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 440));

        PanelProductos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtBuscarProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarProductoActionPerformed(evt);
            }
        });
        PanelProductos.add(txtBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 460, 30));

        btnBuscarProducto.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscarProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarProducto.setText("Buscar");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });
        PanelProductos.add(btnBuscarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 90, 30));

        btnAtrasProductos.setBackground(new java.awt.Color(0, 0, 0));
        btnAtrasProductos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAtrasProductos.setForeground(new java.awt.Color(255, 255, 255));
        btnAtrasProductos.setText("Atras");
        btnAtrasProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasProductosActionPerformed(evt);
            }
        });
        PanelProductos.add(btnAtrasProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 90, 30));

        jScrollProductos.setBackground(new java.awt.Color(102, 102, 102));
        jScrollProductos.setBorder(null);

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollProductos.setViewportView(TablaProductos);

        PanelProductos.add(jScrollProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 740, 260));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        PanelProductos.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bw-background-1.jpg"))); // NOI18N
        PanelProductos.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 440));

        PanelAdministrador.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalirAdministrador.setBackground(new java.awt.Color(0, 0, 0));
        btnSalirAdministrador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalirAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        btnSalirAdministrador.setText("Salir");
        btnSalirAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirAdministradorActionPerformed(evt);
            }
        });
        PanelAdministrador.add(btnSalirAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 90, 30));

        btnRegAdministrador.setBackground(new java.awt.Color(0, 0, 0));
        btnRegAdministrador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        btnRegAdministrador.setText("Registrar Empleado");
        btnRegAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegAdministradorActionPerformed(evt);
            }
        });
        PanelAdministrador.add(btnRegAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 170, 40));

        btnEmpleados1.setBackground(new java.awt.Color(0, 0, 0));
        btnEmpleados1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEmpleados1.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpleados1.setText("Empleados");
        btnEmpleados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleados1ActionPerformed(evt);
            }
        });
        PanelAdministrador.add(btnEmpleados1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 170, 40));

        btnBuscarAdministrador.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscarAdministrador.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscarAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarAdministrador.setText("Empleado");
        btnBuscarAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAdministradorActionPerformed(evt);
            }
        });
        PanelAdministrador.add(btnBuscarAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 170, 40));

        btnProductos1.setBackground(new java.awt.Color(0, 0, 0));
        btnProductos1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnProductos1.setForeground(new java.awt.Color(255, 255, 255));
        btnProductos1.setText("Productos");
        btnProductos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductos1ActionPerformed(evt);
            }
        });
        PanelAdministrador.add(btnProductos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 170, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        PanelAdministrador.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bw-background-1.jpg"))); // NOI18N
        PanelAdministrador.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 440));

        PanelRegistrarEmpleados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSalirAdministrador1.setBackground(new java.awt.Color(0, 0, 0));
        btnSalirAdministrador1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalirAdministrador1.setForeground(new java.awt.Color(255, 255, 255));
        btnSalirAdministrador1.setText("Salir");
        btnSalirAdministrador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirAdministrador1ActionPerformed(evt);
            }
        });
        PanelRegistrarEmpleados.add(btnSalirAdministrador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 90, 30));
        PanelRegistrarEmpleados.add(txtNombreRegAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 200, -1));
        PanelRegistrarEmpleados.add(txtApellidoRegAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 200, -1));
        PanelRegistrarEmpleados.add(txtCorreoRegAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 200, -1));
        PanelRegistrarEmpleados.add(txtSalarioRegistroEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 200, -1));
        PanelRegistrarEmpleados.add(txtCIRegAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 200, -1));

        ComboAnhoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboAnhoEmpleadoActionPerformed(evt);
            }
        });
        PanelRegistrarEmpleados.add(ComboAnhoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 70, -1));

        ComboMesEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        PanelRegistrarEmpleados.add(ComboMesEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 50, -1));

        ComboDiaEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        ComboDiaEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboDiaEmpleadoActionPerformed(evt);
            }
        });
        PanelRegistrarEmpleados.add(ComboDiaEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 50, -1));

        PanelRegistrarEmpleados.add(ComboRegistroEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 50, -1));

        lblSalario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSalario.setForeground(new java.awt.Color(255, 255, 255));
        lblSalario.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSalario.setText("Salario:");
        PanelRegistrarEmpleados.add(lblSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 140, -1));

        lblSucursalEmpleados.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSucursalEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        lblSucursalEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSucursalEmpleados.setText("Sucursal:");
        PanelRegistrarEmpleados.add(lblSucursalEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 140, -1));

        lblCIReg3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCIReg3.setForeground(new java.awt.Color(255, 255, 255));
        lblCIReg3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCIReg3.setText("Fecha nacimiento:");
        PanelRegistrarEmpleados.add(lblCIReg3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 140, -1));

        lblApellidoReg1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblApellidoReg1.setForeground(new java.awt.Color(255, 255, 255));
        lblApellidoReg1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblApellidoReg1.setText("Apellido:");
        PanelRegistrarEmpleados.add(lblApellidoReg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 70, -1));

        lblCIReg1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCIReg1.setForeground(new java.awt.Color(255, 255, 255));
        lblCIReg1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCIReg1.setText("CI:");
        PanelRegistrarEmpleados.add(lblCIReg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 70, -1));

        lblCorreroReg1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCorreroReg1.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreroReg1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCorreroReg1.setText("Correo:");
        PanelRegistrarEmpleados.add(lblCorreroReg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, 70, -1));

        lblNombreReg1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombreReg1.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreReg1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreReg1.setText("Nombre:");
        PanelRegistrarEmpleados.add(lblNombreReg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 70, -1));

        btnRegEmpleado.setBackground(new java.awt.Color(0, 0, 0));
        btnRegEmpleado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRegEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnRegEmpleado.setText("Registrar");
        btnRegEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegEmpleadoActionPerformed(evt);
            }
        });
        PanelRegistrarEmpleados.add(btnRegEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 110, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        PanelRegistrarEmpleados.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bw-background-1.jpg"))); // NOI18N
        PanelRegistrarEmpleados.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 440));

        PanelBuscarAdmin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBuscarAdmin.setBackground(new java.awt.Color(0, 0, 0));
        btnBuscarAdmin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnBuscarAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarAdmin.setText("Buscar");
        btnBuscarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarAdminActionPerformed(evt);
            }
        });
        PanelBuscarAdmin.add(btnBuscarAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "10", "11", "12" }));
        PanelBuscarAdmin.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 80, 30));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        PanelBuscarAdmin.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 110, 80, 30));

        PanelBuscarAdmin.add(jComboAnhoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 80, 30));

        btnSalirAdministrador2.setBackground(new java.awt.Color(0, 0, 0));
        btnSalirAdministrador2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalirAdministrador2.setForeground(new java.awt.Color(255, 255, 255));
        btnSalirAdministrador2.setText("Salir");
        btnSalirAdministrador2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirAdministrador2ActionPerformed(evt);
            }
        });
        PanelBuscarAdmin.add(btnSalirAdministrador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 90, 30));
        PanelBuscarAdmin.add(txtNombreRegAdmin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 200, 30));

        ScrollAdmin.setBackground(new java.awt.Color(102, 102, 102));
        ScrollAdmin.setBorder(null);

        TablaAdmin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Apellidos", "CI", "Paquete", "Vigencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrollAdmin.setViewportView(TablaAdmin);

        PanelBuscarAdmin.add(ScrollAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 740, 260));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        PanelBuscarAdmin.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bw-background-1.jpg"))); // NOI18N
        PanelBuscarAdmin.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 440));

        PanelAnhadirProductoAdmin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAnhadirProductoAdmin.setBackground(new java.awt.Color(0, 0, 0));
        btnAnhadirProductoAdmin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAnhadirProductoAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnAnhadirProductoAdmin.setText("Anhadir");
        btnAnhadirProductoAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnhadirProductoAdminActionPerformed(evt);
            }
        });
        PanelAnhadirProductoAdmin.add(btnAnhadirProductoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 90, 30));

        btnSalirProductoAdmin.setBackground(new java.awt.Color(0, 0, 0));
        btnSalirProductoAdmin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalirProductoAdmin.setForeground(new java.awt.Color(255, 255, 255));
        btnSalirProductoAdmin.setText("Salir");
        btnSalirProductoAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirProductoAdminActionPerformed(evt);
            }
        });
        PanelAnhadirProductoAdmin.add(btnSalirProductoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 90, 30));
        PanelAnhadirProductoAdmin.add(txtNombreAnhadirProductoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 200, -1));

        lblNombreReg2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblNombreReg2.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreReg2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNombreReg2.setText("Nombre:");
        PanelAnhadirProductoAdmin.add(lblNombreReg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 70, -1));

        lblCorreroReg2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblCorreroReg2.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreroReg2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCorreroReg2.setText("Precio:");
        PanelAnhadirProductoAdmin.add(lblCorreroReg2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 70, -1));
        PanelAnhadirProductoAdmin.add(txtPrecioProductoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 200, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        PanelAnhadirProductoAdmin.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bw-background-1.jpg"))); // NOI18N
        PanelAnhadirProductoAdmin.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 440));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPass.setForeground(new java.awt.Color(255, 255, 255));
        lblPass.setText("Contraseña:");
        PanelLogin.add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 90, 20));

        txtPass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PanelLogin.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 160, 30));

        btnExit.setBackground(new java.awt.Color(0, 0, 0));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Salir");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        PanelLogin.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        btnLogin.setBackground(new java.awt.Color(0, 0, 0));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Ingresar");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        PanelLogin.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 100, -1));

        txtUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        PanelLogin.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 160, 30));

        lblUser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setText("Usuario:");
        PanelLogin.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Cambria", 2, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Gym de Caña");
        PanelLogin.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 200, 50));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Logo1.png"))); // NOI18N
        PanelLogin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        lblFondoBase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/bw-background-1.jpg"))); // NOI18N
        PanelLogin.add(lblFondoBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 350));

        getContentPane().add(PanelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        PanelLogin.setVisible(false);
        this.setSize(780, 443);
        this.setLocationRelativeTo(null);
        String user = txtUser.getText();
        String pass = txtPass.getText();
        if (user.equals("Admin")) {
            getContentPane().add(PanelAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 450));
            PanelAdministrador.setVisible(true);
        } else {
            getContentPane().add(PanelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 450));
            PanelInicio.setVisible(true);
        }
        txtPass.setText("");
        txtUser.setText("");
        System.out.println("User: " + user + "\n" + "Pass: " + pass);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        PanelInicio.setVisible(false);
        this.setSize(390, 350);
        this.setLocationRelativeTo(null);
        getContentPane().add(PanelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 350));
        PanelLogin.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        PanelInicio.setVisible(false);
        this.setSize(780, 443);
        this.setLocationRelativeTo(null);
        getContentPane().add(PanelClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 443));
        ScrollClientes.setOpaque(false);
        ScrollClientes.getViewport().setOpaque(false);
        PanelClientes.setVisible(true);
        listaClientes();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        PanelInicio.setVisible(false);
        this.setSize(780, 443);
        this.setLocationRelativeTo(null);
        getContentPane().add(PanelProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 443));
        jScrollProductos.setOpaque(false);
        jScrollProductos.getViewport().setOpaque(false);
        listaProductos();
        PanelProductos.setVisible(true);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadosActionPerformed
        PanelInicio.setVisible(false);
        this.setSize(780, 443);
        this.setLocationRelativeTo(null);
        getContentPane().add(PanelEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 443));
        jScrollEmpleados.setOpaque(false);
        jScrollEmpleados.getViewport().setOpaque(false);
        //jScrollEmpleados.getBorder().isBorderOpaque();
        PanelEmpleados.setVisible(true);
    }//GEN-LAST:event_btnEmpleadosActionPerformed

    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed
        PanelInicio.setVisible(false);
        this.setSize(780, 443);
        this.setLocationRelativeTo(null);
        getContentPane().add(PanelRegistrarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 443));
        int year = (Calendar.getInstance()).get(Calendar.YEAR);
        for (int i = 1950; i <= year; i++) {
            ComboAnhoCliente.addItem(i + "");
        }

        int cantidadSucursales = factory.getSucursalesDao().get().size();
        System.out.println("Cantidad: " + cantidadSucursales);
        for (int i = 0; i < cantidadSucursales; i++) {
            ComboRegistroClientes.addItem("" + (i + 1));
        }
        PanelRegistrarClientes.setVisible(true);
    }//GEN-LAST:event_btnRegActionPerformed

    private void btnAtrasRegistroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasRegistroClientesActionPerformed
        PanelRegistrarClientes.setVisible(false);
        this.setSize(780, 443);
        this.setLocationRelativeTo(null);
        getContentPane().add(PanelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 443));
        PanelInicio.setVisible(true);
    }//GEN-LAST:event_btnAtrasRegistroClientesActionPerformed

    private void btnAtrasClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasClientesActionPerformed
        PanelClientes.setVisible(false);
        this.setSize(780, 443);
        this.setLocationRelativeTo(null);
        getContentPane().add(PanelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 443));
        txtBuscarCliente.setText("");
        PanelInicio.setVisible(true);
    }//GEN-LAST:event_btnAtrasClientesActionPerformed

    private void btnAtrasEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasEmpleadosActionPerformed
        PanelEmpleados.setVisible(false);
        this.setSize(780, 443);
        this.setLocationRelativeTo(null);
        getContentPane().add(PanelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 443));
        PanelInicio.setVisible(true);
    }//GEN-LAST:event_btnAtrasEmpleadosActionPerformed

    private void btnAtrasProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasProductosActionPerformed
        PanelProductos.setVisible(false);
        this.setSize(780, 443);
        this.setLocationRelativeTo(null);
        getContentPane().add(PanelInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 443));
        txtBuscarProducto.setText("");
        PanelInicio.setVisible(true);
    }//GEN-LAST:event_btnAtrasProductosActionPerformed

    private void btnRegistrarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarEntradaActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
         
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void txtBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarProductoActionPerformed

    private void btnSalirAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirAdministradorActionPerformed
        PanelAdministrador.setVisible(false);
        this.setSize(390, 350);
        this.setLocationRelativeTo(null);
        getContentPane().add(PanelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 350));
        PanelLogin.setVisible(true);
    }//GEN-LAST:event_btnSalirAdministradorActionPerformed

    private void btnRegAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegAdministradorActionPerformed
        PanelAdministrador.setVisible(false);
        this.setSize(780, 443);
        this.setLocationRelativeTo(null);
        getContentPane().add(PanelRegistrarEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 443));
        int year = ((Calendar.getInstance()).get(Calendar.YEAR)) - 18;
        for (int i = 1950; i <= year; i++) {
            ComboAnhoEmpleado.addItem(i + "");
        }

        int cantidadSucursales = factory.getSucursalesDao().get().size();
        for (int i = 0; i < cantidadSucursales; i++) {
            ComboRegistroEmpleado.addItem("" + (i + 1));
        }
        PanelRegistrarEmpleados.setVisible(true);
    }//GEN-LAST:event_btnRegAdministradorActionPerformed

    private void btnEmpleados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleados1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmpleados1ActionPerformed

    private void btnBuscarAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAdministradorActionPerformed
        PanelAdministrador.setVisible(false);
        this.setSize(780, 443);
        this.setLocationRelativeTo(null);
        getContentPane().add(PanelBuscarAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 443));
        ScrollAdmin.setOpaque(false);
        ScrollAdmin.getViewport().setOpaque(false);
        int year = (Calendar.getInstance()).get(Calendar.YEAR);
        for (int i = 2015; i <= year; i++) {
            jComboAnhoAdmin.addItem(i + "");
        }
        listaEmpleados();
        PanelBuscarAdmin.setVisible(true);
    }//GEN-LAST:event_btnBuscarAdministradorActionPerformed

    private void btnProductos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductos1ActionPerformed
        PanelAdministrador.setVisible(false);
        this.setSize(780, 443);
        this.setLocationRelativeTo(null);
        getContentPane().add(PanelAnhadirProductoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 443));
        PanelAnhadirProductoAdmin.setVisible(true);
    }//GEN-LAST:event_btnProductos1ActionPerformed

    private void btnSalirAdministrador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirAdministrador1ActionPerformed
        PanelRegistrarEmpleados.setVisible(false);
        this.setSize(780, 443);
        this.setLocationRelativeTo(null);
        getContentPane().add(PanelAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 443));
        PanelAdministrador.setVisible(true);
    }//GEN-LAST:event_btnSalirAdministrador1ActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed

    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnSalirAdministrador2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirAdministrador2ActionPerformed
        PanelBuscarAdmin.setVisible(false);
        this.setSize(780, 443);
        this.setLocationRelativeTo(null);
        getContentPane().add(PanelAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 443));
        PanelAdministrador.setVisible(true);
    }//GEN-LAST:event_btnSalirAdministrador2ActionPerformed

    private void btnBuscarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarAdminActionPerformed

    private void txtBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarClienteActionPerformed

    private void ComboAnhoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboAnhoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboAnhoClienteActionPerformed

    private void ComboAnhoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboAnhoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboAnhoEmpleadoActionPerformed

    private void btnRegEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegEmpleadoActionPerformed
        String fecha = ComboAnhoEmpleado.getSelectedItem() + " " + ComboMesEmpleado.getSelectedItem() + " " + ComboDiaEmpleado.getSelectedItem();
        System.out.println(txtNombreRegAdmin.getText() + "\n" + fecha);
        Empleado e = new Empleado();

        if (txtNombreRegAdmin != null) {
            e.setNombre(txtNombreRegAdmin.getText());
        } else {
            JOptionPane.showMessageDialog(rootPane, "Error en nombre!");
            return;
        }
        if (txtApellidoRegAdmin != null) {
            e.setApellidos(txtApellidoRegAdmin.getText());
        } else {
            JOptionPane.showMessageDialog(rootPane, "Error en Apellidos!");
            return;
        }
        if (txtCIRegAdmin != null) {
            e.setCi(txtCIRegAdmin.getText());
        } else {
            JOptionPane.showMessageDialog(rootPane, "Error en Carnet de identidad!");
            return;
        }
        if (ComboRegistroEmpleado != null) {
            e.setSucursal_id(ComboRegistroEmpleado.getSelectedIndex());
        } else {
            JOptionPane.showMessageDialog(rootPane, "Error en Sucursal!");
            return;
        }
        if (ComboAnhoEmpleado != null && ComboMesEmpleado != null && ComboDiaEmpleado != null) {
            String s = ComboAnhoEmpleado.getSelectedItem().toString() + ComboMesEmpleado.getSelectedItem().toString() + ComboDiaEmpleado.getSelectedItem().toString();
            System.out.println("Date: --- " +s);
            Date dt = new Date(Long.parseLong(s));
            e.setFecha(s);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Error en fecha!");
            return;
        }

        e.setDesc_labor("Trabajito ATP");

        if (txtSalarioRegistroEmpleado != null) {
            try {
                e.setSalario(Float.parseFloat(txtSalarioRegistroEmpleado.getText()));
            } catch (NumberFormatException x) {
                JOptionPane.showMessageDialog(rootPane, "Error en Parseando el salario! " + x.getMessage());
                return;
            }
        }

        insertar_actualizar_empleado(e);
    }//GEN-LAST:event_btnRegEmpleadoActionPerformed

    private void ComboDiaEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboDiaEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboDiaEmpleadoActionPerformed

    private void btnRegClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegClienteActionPerformed
        Cliente e = new Cliente();

        if (txtNombreReg != null) {
            e.setNombre(txtNombreReg.getText());
        } else {
            JOptionPane.showMessageDialog(rootPane, "Error en nombre!");
            return;
        }
        if (txtApellidoReg != null) {
            e.setApellidos(txtApellidoReg.getText());
        } else {
            JOptionPane.showMessageDialog(rootPane, "Error en Apellidos!");
            return;
        }
        if (txtCIReg != null) {
            e.setCi(txtCIReg.getText());
        } else {
            JOptionPane.showMessageDialog(rootPane, "Error en Carnet de identidad!");
            return;
        }
        if (ComboRegistroClientes != null) {
            e.setSucursal_id(ComboRegistroClientes.getSelectedIndex());
        } else {
            JOptionPane.showMessageDialog(rootPane, "Error en Sucursal!");
            return;
        }
        if (ComboAnhoCliente != null && comboMesCliente != null && comboDiaCliente != null) {
            String s = ComboAnhoCliente.getSelectedItem().toString() + comboMesCliente.getSelectedItem().toString() + comboDiaCliente.getSelectedItem().toString();
            e.setFecha(s);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Error en fecha!");
            return;
        }

        if (CheckBoxPermitido.isSelected()) {
            e.setPermitido(true);
        } else {
            e.setPermitido(false);
        }

        insertar_actualizar_cliente(e);

    }//GEN-LAST:event_btnRegClienteActionPerformed

    private void CheckBoxPermitidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxPermitidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckBoxPermitidoActionPerformed

    private void btnSalirProductoAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirProductoAdminActionPerformed
        PanelAnhadirProductoAdmin.setVisible(false);
        this.setSize(780, 443);
        this.setLocationRelativeTo(null);
        getContentPane().add(PanelAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 443));
        PanelAdministrador.setVisible(true);
    }//GEN-LAST:event_btnSalirProductoAdminActionPerformed

    private void btnAnhadirProductoAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnhadirProductoAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnhadirProductoAdminActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Ventana().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Ventana.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBoxPermitido;
    private javax.swing.JComboBox<String> ComboAnhoCliente;
    private javax.swing.JComboBox<String> ComboAnhoEmpleado;
    private javax.swing.JComboBox<String> ComboDiaEmpleado;
    private javax.swing.JComboBox<String> ComboMesEmpleado;
    private javax.swing.JComboBox<String> ComboRegistroClientes;
    private javax.swing.JComboBox<String> ComboRegistroEmpleado;
    private javax.swing.JPanel PanelAdministrador;
    private javax.swing.JPanel PanelAnhadirProductoAdmin;
    private javax.swing.JPanel PanelBuscarAdmin;
    private javax.swing.JPanel PanelClientes;
    private javax.swing.JPanel PanelEmpleados;
    private javax.swing.JPanel PanelInicio;
    private javax.swing.JPanel PanelLogin;
    private javax.swing.JPanel PanelProductos;
    private javax.swing.JPanel PanelRegistrarClientes;
    private javax.swing.JPanel PanelRegistrarEmpleados;
    private javax.swing.JScrollPane ScrollAdmin;
    private javax.swing.JScrollPane ScrollClientes;
    private javax.swing.JTable TablaAdmin;
    private javax.swing.JTable TablaClientes;
    private javax.swing.JTable TablaEmpleados;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JButton btnAnhadirProductoAdmin;
    private javax.swing.JButton btnAtrasClientes;
    private javax.swing.JButton btnAtrasEmpleados;
    private javax.swing.JButton btnAtrasProductos;
    private javax.swing.JButton btnAtrasRegistroClientes;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarAdmin;
    private javax.swing.JButton btnBuscarAdministrador;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnEmpleados;
    private javax.swing.JButton btnEmpleados1;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProductos1;
    private javax.swing.JButton btnReg;
    private javax.swing.JButton btnRegAdministrador;
    private javax.swing.JButton btnRegCliente;
    private javax.swing.JButton btnRegEmpleado;
    private javax.swing.JButton btnRegistrarEntrada;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSalirAdministrador;
    private javax.swing.JButton btnSalirAdministrador1;
    private javax.swing.JButton btnSalirAdministrador2;
    private javax.swing.JButton btnSalirProductoAdmin;
    private javax.swing.JComboBox<String> comboDiaCliente;
    private javax.swing.JComboBox<String> comboMesCliente;
    private javax.swing.JComboBox<String> jComboAnhoAdmin;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollEmpleados;
    private javax.swing.JScrollPane jScrollProductos;
    private javax.swing.JLabel lblApellidoReg;
    private javax.swing.JLabel lblApellidoReg1;
    private javax.swing.JLabel lblCIReg;
    private javax.swing.JLabel lblCIReg1;
    private javax.swing.JLabel lblCIReg2;
    private javax.swing.JLabel lblCIReg3;
    private javax.swing.JLabel lblCorreroReg;
    private javax.swing.JLabel lblCorreroReg1;
    private javax.swing.JLabel lblCorreroReg2;
    private javax.swing.JLabel lblFondoBase;
    private javax.swing.JLabel lblNombreReg;
    private javax.swing.JLabel lblNombreReg1;
    private javax.swing.JLabel lblNombreReg2;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JLabel lblSucursalClientes;
    private javax.swing.JLabel lblSucursalEmpleados;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTextField txtApellidoReg;
    private javax.swing.JTextField txtApellidoRegAdmin;
    private javax.swing.JTextField txtBuscarCliente;
    private javax.swing.JTextField txtBuscarProducto;
    private javax.swing.JTextField txtCIReg;
    private javax.swing.JTextField txtCIRegAdmin;
    private javax.swing.JTextField txtCorreoReg;
    private javax.swing.JTextField txtCorreoRegAdmin;
    private javax.swing.JTextField txtNombreAnhadirProductoAdmin;
    private javax.swing.JTextField txtNombreReg;
    private javax.swing.JTextField txtNombreRegAdmin;
    private javax.swing.JTextField txtNombreRegAdmin1;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JPasswordField txtPassEntrada;
    private javax.swing.JTextField txtPrecioProductoAdmin;
    private javax.swing.JTextField txtSalarioRegistroEmpleado;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
