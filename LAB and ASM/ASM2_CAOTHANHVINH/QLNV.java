/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ASM2;
import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ASUS
 */
public class QLNV extends javax.swing.JFrame {
    ArrayList<Employee> list = new ArrayList<>();
    //1. Thêm vào table
    public void addEmployee()
    {
        Employee arr = new Employee();
        
        arr.setMaNV(txtMANV.getText());
        arr.setHoTen(txtName.getText());
        arr.setTuoi(Integer.parseInt(txtAge.getText()));
        arr.setEmail(txtEmail.getText());
        arr.setLuong(Integer.parseInt(txtLuong.getText()));
        
        list.add(arr);
    }
    
    public void fillToTable()
    {
        DefaultTableModel model = (DefaultTableModel)tblNhanVien.getModel();
        model.setRowCount(0);
        
        for(Employee arr : list)
        {
            Object[] row = new Object[]{arr.getMaNV(), arr.getHoTen(), arr.getTuoi(), arr.getEmail(), arr.getLuong()};
            model.addRow(row);
        }        
    }
    int index = 0;
    
    // 2.Show row lên controls
    public void showDetails()
    {
        index = tblNhanVien.getSelectedRow();
        
        Employee nv = list.get(index);
        txtName.setText(""+nv.getHoTen());
        txtMANV.setText(""+nv.getMaNV());
        txtEmail.setText(""+nv.getEmail());
        txtAge.setText(""+nv.getTuoi());
        txtLuong.setText(""+nv.getLuong());
    }
    
    // 3.Xóa dữ liệu
    public void Remove()
    {
        list.remove(index);
        index = -1;
        
        txtMANV.setText("");
        txtName.setText("");
        txtAge.setText("");
        txtEmail.setText("");
        txtLuong.setText("");
    }
    
    //4.Kiểm tra tính hợp lệ dữ liệu
    public boolean validate_data()
    {
        //a. Kiểm tra MaNV
        if(txtMANV.getText().trim().length() == 0)
        {
            //Báo lỗi
            JOptionPane.showMessageDialog(this, "Không bỏ trống Mã Nhân Viên","ERROR",JOptionPane.WARNING_MESSAGE);
            //Set màu nền
            txtMANV.setBackground(Color.RED);
            //Nháy 
            txtMANV.requestFocus();
            //Kết thúc hàm không làm lệnh phía sau nữa
            return false;
        }
        //b. Họ Tên
        if(txtName.getText().trim().length() == 0)
        {
            JOptionPane.showMessageDialog(this, "Không bỏ trống Tên Nhân Viên","ERROR",JOptionPane.WARNING_MESSAGE);
            txtName.setBackground(Color.RED);
            txtName.requestFocus();
            return false;
        }
        //c. Tuổi
        if(txtAge.getText().trim().length() == 0)
        {
            JOptionPane.showMessageDialog(this, "Không bỏ trống Tuổi Nhân Viên","ERROR",JOptionPane.WARNING_MESSAGE);
            txtAge.setBackground(Color.RED);
            txtAge.requestFocus();
            return false;
        }

        try {
            int Tuoi = Integer.parseInt(txtAge.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tuổi Nhân Viên phải là số","ERROR",JOptionPane.WARNING_MESSAGE);
            txtAge.setBackground(Color.RED);
            txtAge.requestFocus();
            return false;
        }
        
        //d. Luong
        if(txtLuong.getText().trim().length() == 0)
        {
            JOptionPane.showMessageDialog(this, "Không bỏ trống Lương","ERROR",JOptionPane.WARNING_MESSAGE);
            txtLuong.setBackground(Color.RED);
            txtLuong.requestFocus();
            return false;
        }
        
        try {
            int Luong = Integer.parseInt(txtLuong.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Lương Nhân Viên phải là số","ERROR",JOptionPane.WARNING_MESSAGE);
            txtLuong.setBackground(Color.RED);
            txtLuong.requestFocus();
            return false;
        }
        
        //e. Email
        if(txtEmail.getText().trim().length() == 0)
        {
            JOptionPane.showMessageDialog(this, "Không bỏ trống Email","ERROR",JOptionPane.WARNING_MESSAGE);
            txtEmail.setBackground(Color.RED);
            txtEmail.requestFocus();
            return false;
        }
        return true;
    }
    
    //6. Tìm theo Id và Name
    public void findByID()
    {
        //Lấy maNV
        String maNV = txtMANV.getText();
        
        //Duyệt qua danh sách list
        for(Employee emp : list)
        {
            //Nếu tìm thấy trong danh sách
            if(emp.getMaNV().equals(maNV))
            {
                //Xác định vị trí nhân viên trong list
                index = list.indexOf(emp);
                //Tô đen dòng khi tìm thấy
                tblNhanVien.setRowSelectionInterval(index, index);
                //Hiển thị lên controls
                showDetails();
                //Kết thúc lệnh
                return;
            }
        }
        JOptionPane.showMessageDialog(this,"Mã Nhân Viên Không Tồn Tại!","ERROR",JOptionPane.WARNING_MESSAGE);
    }
    
    public void findByName()
    {
        String name = txtName.getText();
        for(Employee emp : list)
        {
            if(emp.getHoTen().equals(name))
            {
                index = list.indexOf(emp);
                tblNhanVien.setRowSelectionInterval(index, index);
                showDetails();
                return;
            }
        }
        JOptionPane.showMessageDialog(this,"Tên Nhân Viên Không Tồn Tại!","ERROR",JOptionPane.WARNING_MESSAGE);
    }
    
    //7. Save file, Open file
    public void saveFile()
    {
        //Lưu danh sách list xuống file
        XFile.writeObject("h://Employee.com", list); //XFile.writeObject("ổ đĩa://Tên tự đặt.Tự đặt",ArrayList đã khai báo)
        
        //Thông báo thành công
        JOptionPane.showMessageDialog(this, "Save file thành công");
    }
    
    public void openFile()
    {
        //Đọc từ file h://Employee.com ra danh sách list(ArrayList đã khai báo)
        // Bước 1: (...)Tên class XFile: Ép kiểu
        list = (ArrayList<Employee>)XFile.readObject("h://Employee.com");// XFile.readObject("đường link nằm trên saveFile")
        
        // Bước 2: Gọi hàm load dữ liệu lên table
        fillToTable();
        
        // Bước 3: Thông báo thành công
        JOptionPane.showMessageDialog(this, "Open thành công");
    }

    public QLNV(JButton bttDelete, JButton bttExit, JButton bttFind, JButton bttFirst, JButton bttLast, JButton bttNew, JButton bttNext, JButton bttOpen, JButton bttPrev, JButton bttSave, JLabel jLabel1, JLabel jLabel2, JLabel jLabel3, JLabel jLabel4, JLabel jLabel5, JLabel jLabel6, JPanel jPanel1, JScrollPane jScrollPane1, JTable tblNhanVien, JTextField txtAge, JTextField txtEmail, JTextField txtLuong, JTextField txtMANV, JTextField txtName) throws HeadlessException {
        this.bttDelete = bttDelete;
        this.bttExit = bttExit;
        this.bttFind = bttFind;
        this.bttFirst = bttFirst;
        this.bttLast = bttLast;
        this.bttNew = bttNew;
        this.bttNext = bttNext;
        this.bttOpen = bttOpen;
        this.bttPrev = bttPrev;
        this.bttSave = bttSave;
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jLabel3 = jLabel3;
        this.jLabel4 = jLabel4;
        this.jLabel5 = jLabel5;
        this.jLabel6 = jLabel6;
        this.jPanel1 = jPanel1;
        this.jScrollPane1 = jScrollPane1;
        this.tblNhanVien = tblNhanVien;
        this.txtAge = txtAge;
        this.txtEmail = txtEmail;
        this.txtLuong = txtLuong;
        this.txtMANV = txtMANV;
        this.txtName = txtName;
    }

    public QLNV(JButton bttDelete, JButton bttExit, JButton bttFind, JButton bttFirst, JButton bttLast, JButton bttNew, JButton bttNext, JButton bttOpen, JButton bttPrev, JButton bttSave, JLabel jLabel1, JLabel jLabel2, JLabel jLabel3, JLabel jLabel4, JLabel jLabel5, JLabel jLabel6, JPanel jPanel1, JScrollPane jScrollPane1, JTable tblNhanVien, JTextField txtAge, JTextField txtEmail, JTextField txtLuong, JTextField txtMANV, JTextField txtName, GraphicsConfiguration gc) {
        super(gc);
        this.bttDelete = bttDelete;
        this.bttExit = bttExit;
        this.bttFind = bttFind;
        this.bttFirst = bttFirst;
        this.bttLast = bttLast;
        this.bttNew = bttNew;
        this.bttNext = bttNext;
        this.bttOpen = bttOpen;
        this.bttPrev = bttPrev;
        this.bttSave = bttSave;
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jLabel3 = jLabel3;
        this.jLabel4 = jLabel4;
        this.jLabel5 = jLabel5;
        this.jLabel6 = jLabel6;
        this.jPanel1 = jPanel1;
        this.jScrollPane1 = jScrollPane1;
        this.tblNhanVien = tblNhanVien;
        this.txtAge = txtAge;
        this.txtEmail = txtEmail;
        this.txtLuong = txtLuong;
        this.txtMANV = txtMANV;
        this.txtName = txtName;
    }
    
    
    /**
     * Creates new form QLNV
     */
    public QLNV() {
        initComponents();
        //1. New Thread()
        new Thread()
        {
            //2. Create public void run
            public void run()
            {
                //3. Create While
                while(true) {                    
                    try {
                        //4. Tạo 1 đối tượng
                        Date date = new Date();
                        
                        //5. Tạo SimpleDateFormat định dạng  hh:mm:ss aa
                        SimpleDateFormat sdf = new SimpleDateFormat();
                        
                        //6. Định dạng hh:mm:ss aa
                        sdf.applyPattern("hh:mm:ss aa");
                        
                        //7. Hiển thị ra label
                        Clock.setText(""+sdf.format(date));

                        //8. Tôc độ mili giây
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMANV = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtLuong = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        bttNew = new javax.swing.JButton();
        bttSave = new javax.swing.JButton();
        bttDelete = new javax.swing.JButton();
        bttFind = new javax.swing.JButton();
        bttOpen = new javax.swing.JButton();
        bttExit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        bttFirst = new javax.swing.JButton();
        bttPrev = new javax.swing.JButton();
        bttNext = new javax.swing.JButton();
        bttLast = new javax.swing.JButton();
        Clock = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("MÃ NHÂN VIÊN");

        jLabel2.setText("LƯƠNG");

        jLabel3.setText("TUỔI");

        jLabel4.setText("HỌ VÀ TÊN");

        jLabel5.setText("EMAIL");

        txtMANV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMANVActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 255));
        jLabel6.setText("QUẢN LÝ NHÂN VIÊN");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtLuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLuongActionPerformed(evt);
            }
        });

        bttNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASM2/Action-file-new-icon.png"))); // NOI18N
        bttNew.setText("New");
        bttNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttNewActionPerformed(evt);
            }
        });

        bttSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASM2/floppy-icon.png"))); // NOI18N
        bttSave.setText("Save");
        bttSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bttSaveMouseClicked(evt);
            }
        });
        bttSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttSaveActionPerformed(evt);
            }
        });

        bttDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASM2/Action-cancel-icon.png"))); // NOI18N
        bttDelete.setText("Delete");
        bttDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttDeleteActionPerformed(evt);
            }
        });

        bttFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASM2/Zoom-icon.png"))); // NOI18N
        bttFind.setText("Find");
        bttFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttFindActionPerformed(evt);
            }
        });

        bttOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASM2/open-file-icon.png"))); // NOI18N
        bttOpen.setText("Open");
        bttOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttOpenActionPerformed(evt);
            }
        });

        bttExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASM2/Users-Exit-icon.png"))); // NOI18N
        bttExit.setText("Exit");
        bttExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bttFind, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bttOpen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bttExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bttDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bttNew, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bttSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(bttNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bttSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bttDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bttFind)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bttOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bttExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Nhân Viên", "Họ và Tên", "Tuổi", "Email", "Lương"
            }
        ));
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNhanVien);

        bttFirst.setText("|<");
        bttFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttFirstActionPerformed(evt);
            }
        });

        bttPrev.setText("<<");
        bttPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttPrevActionPerformed(evt);
            }
        });

        bttNext.setText(">>");
        bttNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttNextActionPerformed(evt);
            }
        });

        bttLast.setText(">|");
        bttLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttLastActionPerformed(evt);
            }
        });

        Clock.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Clock.setForeground(new java.awt.Color(255, 51, 51));
        Clock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Clock.setText("hh:mm:ss");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMANV))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtName))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAge))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmail))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLuong)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bttFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(12, 12, 12)
                                        .addComponent(bttPrev, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bttNext, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(bttLast, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Clock, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMANV, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bttFirst)
                            .addComponent(bttPrev)
                            .addComponent(bttNext)
                            .addComponent(bttLast)
                            .addComponent(Clock, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMANVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMANVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMANVActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtLuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLuongActionPerformed

    private void bttLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttLastActionPerformed
        // TODO add your handling code here:
        index = list.size() - 1;
        tblNhanVien.setRowSelectionInterval(index, index);
        showDetails();
    }//GEN-LAST:event_bttLastActionPerformed

    private void bttExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_bttExitActionPerformed

    private void bttNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttNewActionPerformed
        // TODO add your handling code here:
        txtMANV.setText("");
        txtName.setText("");
        txtAge.setText("");
        txtEmail.setText("");
        txtLuong.setText("");
        
        txtMANV.requestFocus();
    }//GEN-LAST:event_bttNewActionPerformed

    private void bttSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttSaveActionPerformed
        // TODO add your handling code here:
        if(validate_data())
        {
            addEmployee();
            fillToTable();
            saveFile();
            JOptionPane.showMessageDialog(this, "Save thành công");
            txtEmail.setBackground(Color.WHITE);
            txtMANV.setBackground(Color.white);
            txtName.setBackground(Color.white);
            txtAge.setBackground(Color.white);
            txtLuong.setBackground(Color.white);
        }
    }//GEN-LAST:event_bttSaveActionPerformed

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        // TODO add your handling code here:
        showDetails();
    }//GEN-LAST:event_tblNhanVienMouseClicked

    private void bttDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttDeleteActionPerformed
        // TODO add your handling code here:
        Remove();
        fillToTable();
        saveFile();
        JOptionPane.showMessageDialog(this, "Delete thành công");
    }//GEN-LAST:event_bttDeleteActionPerformed

    private void bttFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttFirstActionPerformed
        // TODO add your handling code here:
        index = 0;
        tblNhanVien.setRowSelectionInterval(index, index);
        showDetails();
    }//GEN-LAST:event_bttFirstActionPerformed

    private void bttPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttPrevActionPerformed
        // TODO add your handling code here:
        if(index > 0)
        {
            index --;
            tblNhanVien.setRowSelectionInterval(index, index);
            showDetails();
        }
    }//GEN-LAST:event_bttPrevActionPerformed

    private void bttNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttNextActionPerformed
        // TODO add your handling code here:
        if(index < list.size() - 1)
        {
            index ++;
            tblNhanVien.setRowSelectionInterval(index, index);
            showDetails();
        }
    }//GEN-LAST:event_bttNextActionPerformed

    private void bttSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bttSaveMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_bttSaveMouseClicked

    private void bttOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttOpenActionPerformed
        // TODO add your handling code here:
        openFile();
    }//GEN-LAST:event_bttOpenActionPerformed

    private void bttFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttFindActionPerformed
        // TODO add your handling code here:
        findByID();
        findByName();
    }//GEN-LAST:event_bttFindActionPerformed

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
            java.util.logging.Logger.getLogger(QLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLNV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Clock;
    private javax.swing.JButton bttDelete;
    private javax.swing.JButton bttExit;
    private javax.swing.JButton bttFind;
    private javax.swing.JButton bttFirst;
    private javax.swing.JButton bttLast;
    private javax.swing.JButton bttNew;
    private javax.swing.JButton bttNext;
    private javax.swing.JButton bttOpen;
    private javax.swing.JButton bttPrev;
    private javax.swing.JButton bttSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtMANV;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
