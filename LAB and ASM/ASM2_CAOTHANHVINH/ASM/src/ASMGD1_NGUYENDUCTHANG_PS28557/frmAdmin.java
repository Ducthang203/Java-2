/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ASMGD1_NGUYENDUCTHANG_PS28557;
//1. nhúng thư viện  

import giaidoan1.Employee;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.util.ArrayList;


/**
 *
 * @author admin
 */
public class frmAdmin extends javax.swing.JFrame {

    //1. khai báo danh sách nhân viên
    ArrayList<Employee> list = new ArrayList<>();
    
    //2. Hàm thêm nhân viên addEmployee
    public void addEmployee()
    {
        // - tạo 1 đối tượng của lớp Employee
        Employee emp = new Employee();
        
        // - gán giá trị trên các textBox vào cho đối tượng emp
        emp.setMaNV(txtMANV.getText());
        emp.setHoTen(txtHOTEN.getText());
        emp.setTuoi(Integer.parseInt(txtTUOI.getText()));
        emp.setEmail(txtEMAIL.getText());
        emp.setLuong(Integer.parseInt(txtLUONG.getText()));
        
        // - Thêm vào danh sách nhân viên list
        list.add(emp);
    }
    
    //2. viết hàm fillToTable hiện thị danh sách nhân viên lên bảng
    public void fillToTable()
    {
        //3.1 lấy model dữ liệu
        DefaultTableModel model = (DefaultTableModel)tblEMPLOYEE.getModel();
        
        //3.2 xóa các dòng đi
        model.setRowCount(0);
        
        //3.3. duyệt qua danh sách nhân viên list và hiện thị lên bảng tblEMPLOYEE
        for(Employee emp : list)
        {
            Object[] row = new Object[]{emp.getMaNV(),emp.getHoTen(),
                emp.getTuoi(),emp.getEmail(),emp.getLuong()};
            //3.4 thêm vào model
            model.addRow(row);
        }
    }
    // khai báo biến index để xác định vị trí nhân viên đang chọn
    int index = 0;
    //3. hàm hiện thị chi tiết lên trên controls
    public void showDetail()
    {
        //- xác định người dùng click vào vị trí dòng nào trên bảng
        index = tblEMPLOYEE.getSelectedRow();
        //- lấy ra đối tượng nhân viên tại vị trí index
        Employee emp = list.get(index);
        //- hiện thị thông tin của nhân viên emp lên trên các controls
        txtMANV.setText(emp.getMaNV());
        txtHOTEN.setText(emp.getHoTen());
        txtTUOI.setText(""+emp.getTuoi());
        txtEMAIL.setText(emp.getEmail());
        txtLUONG.setText(""+ emp.getLuong());
    }
    //4. hàm xóa nhân viên
    public void removeEmployee()
    {
        //- xác định người dùng click vào vị trí d  òng nào trên bảng
        index = tblEMPLOYEE.getSelectedRow();
        //xoa nhan vien tai vi tri index trong danh sach
        list.remove(index);
    }
    //5. hàm cập nhật nhân viên
    public void updateEmployee(){
        //- xác định người dùng click vào vị trí dòng nào trên bảng
        index = tblEMPLOYEE.getSelectedRow();
        //- lấy ra đối tượng nhân viên tại vị trí index
        Employee emp = list.get(index);
        // - gán giá trị trên các textBox vào cho đối tượng emp
        emp.setMaNV(txtMANV.getText());
        emp.setHoTen(txtHOTEN.getText());
        emp.setTuoi(Integer.parseInt(txtTUOI.getText()));
        emp.setEmail(txtEMAIL.getText());
        emp.setLuong(Integer.parseInt(txtLUONG.getText()));

    }
    //ham luu file
//    public void saveFile(){
//        // luu danh sach xuong file
//        XFile.writeObject("listNV.dat", list);
//        // thong bao thanh cong
//        JOptionPane.showMessageDialog(this,"thanh cong");
//    }
    public frmAdmin() {
        initComponents();
        // viết hàm hiển thị đồng hôf vào constructor,khi show fom lên nó hiện thỉ đồng hồ
        new Thread(){
            @Override
            public void run(){
                try{
                    while(true)
                    {   
                     //lấy ra ngày giờ hệ thống..,tạo ra 1 đối tượng
                        Calendar cal = Calendar.getInstance();
                        //lấy ra giờ, phút ,giây
                        int gio = cal.getTime().getHours();
                        int phut = cal.getTime().getMinutes();
                        int giay = cal.getTime().getSeconds();
                        //3 hiển thị lên lable
                        jLabel7.setText(gio + ":" + phut + ":" + giay);
                        Thread.sleep(1000);// set cho nó ngủ 1 giây hay là 1000 mili giây     
                    }
                   
                }catch (InterruptedException e){
                    System.out.println("Có Lỗi: "+ e.getMessage());
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

        employee1 = new giaidoan1.Employee();
        txtHOTEN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtEMAIL = new javax.swing.JTextField();
        txtMANV = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTUOI = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtLUONG = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEMPLOYEE = new javax.swing.JTable();
        btnNew = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BtnOpen = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnFirst = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtHOTEN.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Tuổi");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Email");

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASMGD1_NGUYENDUCTHANG_PS28557/Actions-view-refresh-icon.png"))); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtEMAIL.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        txtMANV.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtMANV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMANVActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Họ Tên");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel5.setText("Mã Nhân Viên");

        txtTUOI.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setText("Lương");

        txtLUONG.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        tblEMPLOYEE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã Nhân Viên", "Tên Nhân Viên", "Tuổi", "Email", "Lương"
            }
        ));
        tblEMPLOYEE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEMPLOYEEMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEMPLOYEE);

        btnNew.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASMGD1_NGUYENDUCTHANG_PS28557/Action-edit-icon.png"))); // NOI18N
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASMGD1_NGUYENDUCTHANG_PS28557/document-edit-icon.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASMGD1_NGUYENDUCTHANG_PS28557/Action-cancel-icon.png"))); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASMGD1_NGUYENDUCTHANG_PS28557/Action-cancel-icon.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");
        jLabel1.setAutoscrolls(true);

        BtnOpen.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BtnOpen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ASMGD1_NGUYENDUCTHANG_PS28557/Action-reload-icon.png"))); // NOI18N
        BtnOpen.setText("Open");
        BtnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOpenActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("jLabel7");

        btnFirst.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/z4416129087307_88cb02a823c48223f2a940e822ca85b2.jpg"))); // NOI18N
        btnFirst.setToolTipText("");
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnPrevious.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnPrevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/z4416129258871_96819a56788cf22446eaa95249e4b9db.jpg"))); // NOI18N
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnNext.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/z4416129397618_2306e94afe88a8f6578fdb48030baeaa.jpg"))); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnLast.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/z4416130853945_defd90a0662e70aba989d9547875f74c.jpg"))); // NOI18N
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(btnFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 44, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtMANV, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(35, 35, 35)
                                    .addComponent(btnLast, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtTUOI, javax.swing.GroupLayout.DEFAULT_SIZE, 392, Short.MAX_VALUE)
                                        .addComponent(txtEMAIL)
                                        .addComponent(txtHOTEN)
                                        .addComponent(txtLUONG)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMANV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNew)
                        .addGap(7, 7, 7)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtHOTEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnSave)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnDelete)
                        .addGap(30, 30, 30)
                        .addComponent(btnUpdate)
                        .addGap(35, 35, 35)
                        .addComponent(BtnOpen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFirst))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTUOI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtLUONG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(btnExit))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLast)
                            .addComponent(btnNext)
                            .addComponent(btnPrevious))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        
        //1. gọi hàm addEmployee();
        addEmployee();
        //2. báo thành công
        JOptionPane.showMessageDialog(this, "Thêm thành công.");
        //3. Gọi hàm hiện thị danh sách lên bảng nhé
        fillToTable();
        //
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed

        //1. xóa hết dữ liệu các controls đi
        txtMANV.setText("");
        txtHOTEN.setText("");
        txtTUOI.setText("");
        txtEMAIL.setText("");
        txtLUONG.setText("");
        //2. set con nháy tại txtMANV
        txtMANV.requestFocus();
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        //Gọi lại hàm update phía trên
        updateEmployee();
        //Gọi lại hàm load dữ liệu len bảng
        fillToTable();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed

        //1. thoát khỏi chương trình
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        //gọi lại hàm xóa
        removeEmployee();
        //gọi lại hàm load dữ liệu lên bảng
        fillToTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblEMPLOYEEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEMPLOYEEMouseClicked
        // TODO add your handling code here:
        //1. gọi hàm hiện thị chi tiết
        showDetail();
    }//GEN-LAST:event_tblEMPLOYEEMouseClicked

    private void BtnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOpenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnOpenActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
          // TODO add your handling code here:
          //1 về vị trí đầu tiên tức index = 0
          index = 0;
          //2 to dam nhan vien tai dong dau tien
          tblEMPLOYEE.setRowSelectionInterval(index, index);
          //hien thi thong tin nhan vien dau tien len cac controls
            displayDetails();    
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        //1 về vị trí đầu tiên tức index = 0
          index = list.size()- 1;
          //2 to dam nhan vien tai dong dau tien
          tblEMPLOYEE.setRowSelectionInterval(index, index);
          //hien thi thong tin nhan vien dau tien len cac controls
            displayDetails();
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        // neu ko phai la vị trí đầu tiên 
        if(index > 0){
            // cho về vị trí trước
            index = index - 1;
           //2 to dam nhan vien tai dong dau tien
          tblEMPLOYEE.setRowSelectionInterval(index, index);
          //hien thi thong tin nhan vien dau tien len cac controls
            displayDetails(); 
        }

    }//GEN-LAST:event_btnPreviousActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        // neu ko phai la vị trí cuối cùng
        if(index < list.size() - 1){
            // cho về vị trí trc 
            index = index - 1;
           //2 to dam nhan vien tai vị trí index
          tblEMPLOYEE.setRowSelectionInterval(index, index);
          //hien thi thong tin nhan vien dau tien len cac controls
            displayDetails(); 
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void txtMANVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMANVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMANVActionPerformed

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
            java.util.logging.Logger.getLogger(frmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnOpen;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private giaidoan1.Employee employee1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEMPLOYEE;
    private javax.swing.JTextField txtEMAIL;
    private javax.swing.JTextField txtHOTEN;
    private javax.swing.JTextField txtLUONG;
    private javax.swing.JTextField txtMANV;
    private javax.swing.JTextField txtTUOI;
    // End of variables declaration//GEN-END:variables

    private void displayDetails() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
