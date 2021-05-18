import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;



public class Assign1_Covid3 {

    static myPatient[] arr_patients= new myPatient[20];
    public static class myPatient {
        String name;
        int age;
        char tower;
        String reporting_date;

        myPatient(String name, int age, char tower, String reporting_date) {
            this.name = name;
            this.age = age;
            this.tower = tower;
            this.reporting_date = reporting_date;
        }
    }

    public static void main(String[] args) {

        Swing_display2 obj= new Swing_display2();

        arr_patients[0]= new myPatient("Flora", 6,'A',"2020-04-01");
        arr_patients[1]= new myPatient("Denys", 24,'B',"2020-04-01");
        arr_patients[2]= new myPatient("Jim", 42,'C',"2020-05-18");
        arr_patients[3]= new myPatient("Hazel", 87,'D',"2020-06-23");
        arr_patients[4]= new myPatient("Caery", 72,'A',"2020-06-01");
        arr_patients[5]= new myPatient("David", 7,'B',"2020-06-14");
        arr_patients[6]= new myPatient("Kevim", 37,'D',"2020-06-05");
        arr_patients[7]= new myPatient("Tom", 67,'D',"2020-06-20");
        arr_patients[8]= new myPatient("Bob", 74,'A',"2020-07-04");
        arr_patients[9]= new myPatient("Rachel", 48,'C',"2020-07-24");
        arr_patients[10]= new myPatient("Thomas", 21,'C',"2020-06-11");
        arr_patients[11]= new myPatient("Mary", 17,'D',"2020-06-21");
        arr_patients[12]= new myPatient("Smith", 89,'A',"2020-08-07");
        arr_patients[13]= new myPatient("Pearson", 47,'B',"2020-06-04");
        arr_patients[14]= new myPatient("Anderson", 62,'B',"2020-07-27");
        arr_patients[15]= new myPatient("Johnson", 10,'D',"2020-08-01");
        arr_patients[16]= new myPatient("Robertz", 50,'A',"2020-08-09");
        arr_patients[17]= new myPatient("Julie", 86,'B',"2020-05-02");
        arr_patients[18]= new myPatient("Edith", 42,'D',"2020-06-07");
        arr_patients[19]= new myPatient("John", 95,'D',"2020-06-01");




    }

    public static class Swing_display2 extends JFrame {

        JTable table;
        JFrame frame2;
        JButton jbutton1;

        JCheckBox chbox1 = new JCheckBox("Tower A");
        JCheckBox chbox2 = new JCheckBox("Tower B");
        JCheckBox chbox3 = new JCheckBox("Tower C");
        JCheckBox chbox4 = new JCheckBox("Tower D");

        Swing_display2() {
            JLabel label1 = new JLabel();
            JLabel label2 = new JLabel();
            JLabel label3 = new JLabel();


            int[] recovered= new int[4];
            int[] active = new int[4];

            JLabel label_recovered0 = new JLabel();
            JLabel label_recovered1 = new JLabel();
            JLabel label_recovered2 = new JLabel();
            JLabel label_recovered3 = new JLabel();

            JLabel label_active0= new JLabel();
            JLabel label_active1= new JLabel();
            JLabel label_active2= new JLabel();
            JLabel label_active3= new JLabel();

            JTextField jtext = new JTextField();

            JPanel panel1 = new JPanel();
            panel1.setBorder(BorderFactory.createTitledBorder("Enter Reporting Date below:"));
            label1.setText("Reporting date: (YYYY-MM-DD) ");
            panel1.add(label1);


            jtext.setBackground(Color.cyan);
            jtext.setHorizontalAlignment(SwingConstants.LEADING);
            jtext.setPreferredSize(new Dimension(400,50));
            panel1.add(jtext);
            add(panel1);

            panel1.setVisible(true);

            jbutton1 = new JButton("RESULT \n");
            jbutton1.setBounds(100, 50, 300, 50);
            jbutton1.setHorizontalAlignment(SwingConstants.CENTER);


            JPanel panel2 = new JPanel();
            panel2.setBorder(BorderFactory.createTitledBorder("Select Tower(s) below:"));



            chbox1.setBackground(Color.ORANGE);
            chbox2.setBackground(Color.ORANGE);
            chbox3.setBackground(Color.ORANGE);
            chbox4.setBackground(Color.ORANGE);


            panel2.add(chbox1);
            panel2.add(chbox2);
            panel2.add(chbox3);
            panel2.add(chbox4);

            add(panel2);
            add(jbutton1);




            DefaultTableModel model = new DefaultTableModel(new String[] {"Patient Name", "Age", "Tower", "Reporting Date", "Recovery Date"},0);

            jbutton1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String x= jtext.getText();
                    LocalDate input_date = LocalDate.parse(x);


                    
                for(int i=0; i<20; i++){
                    LocalDate patient_date = LocalDate.parse(arr_patients[i].reporting_date);
                    if(arr_patients[i].tower=='A'){
                        if(input_date.compareTo(patient_date) >0 & input_date.compareTo(patient_date.plusDays(22))>=0)
                            recovered[0]++;
                        else if(input_date.compareTo(patient_date) >=0 & input_date.compareTo(patient_date.plusDays(22))<0)
                            active[0]++;
                    }

                    if(arr_patients[i].tower=='B'){
                        if(input_date.compareTo(patient_date) >0 & input_date.compareTo(patient_date.plusDays(22))>=0)
                            recovered[1]++;
                        else if(input_date.compareTo(patient_date) >=0 & input_date.compareTo(patient_date.plusDays(22))<0)
                            active[1]++;
                    }

                    if(arr_patients[i].tower=='C'){
                        if(input_date.compareTo(patient_date) >0 & input_date.compareTo(patient_date.plusDays(22))>=0)
                            recovered[2]++;
                        else if(input_date.compareTo(patient_date) >=0 & input_date.compareTo(patient_date.plusDays(22))<0)
                            active[2]++;
                    }

                    if(arr_patients[i].tower=='D'){
                        if(input_date.compareTo(patient_date) >0 & input_date.compareTo(patient_date.plusDays(22))>=0)
                            recovered[3]++;
                        else if(input_date.compareTo(patient_date) >=0 & input_date.compareTo(patient_date.plusDays(22))<0)
                            active[3]++;
                    }
                }





                    model.addRow(new Object[]{"PATIENT NAME", "AGE", "TOWER", "REPORTING DATE", "RECOVERY DATE" });

                    label2.setText("The total no. of ACTIVE and RECOVERED Cases in selected Tower(s) are: ");
                    add(label2);


                    if(chbox1.isSelected()){
                        for(int i=0; i<20; i++){
                            LocalDate patient_date = LocalDate.parse(arr_patients[i].reporting_date);
                            if(input_date.compareTo(patient_date) >=0 & arr_patients[i].tower =='A'){
                                model.addRow(new Object[]{arr_patients[i].name, arr_patients[i].age ,arr_patients[i].tower, arr_patients[i].reporting_date, patient_date.plusDays(22) });

                            }
                        }
                        label_active0.setText("\nTOWER A:   "+active[0]+ " Active cases");
                        add(label_active0);

                        label_recovered0.setText("                      " +recovered[0]+" Recovered cases");
                        add(label_recovered0);
                    }

                    if(chbox2.isSelected()){
                        for(int i=0; i<20; i++){
                            LocalDate patient_date = LocalDate.parse(arr_patients[i].reporting_date);
                            if(input_date.compareTo(patient_date) >=0 & arr_patients[i].tower =='B'){
                                model.addRow(new Object[]{arr_patients[i].name, arr_patients[i].age ,arr_patients[i].tower, arr_patients[i].reporting_date, patient_date.plusDays(22) });
                            }

                            label_active1.setText("TOWER B:   "+active[1]+ " Active cases");
                            add(label_active1);

                            label_recovered1.setText("                      " +recovered[1]+" Recovered cases");
                            add(label_recovered1);
                        }
                    }

                    if(chbox3.isSelected()){
                        for(int i=0; i<20; i++){
                            LocalDate patient_date = LocalDate.parse(arr_patients[i].reporting_date);
                            if(input_date.compareTo(patient_date) >=0 & arr_patients[i].tower =='C'){
                                model.addRow(new Object[]{arr_patients[i].name, arr_patients[i].age ,arr_patients[i].tower, arr_patients[i].reporting_date, patient_date.plusDays(22) });
                            }
                        }
                        label_active2.setText("TOWER C:   "+active[2]+ " Active cases");
                        add(label_active2);

                        label_recovered2.setText("                      " +recovered[2]+" Recovered cases" );
                        add(label_recovered2);
                    }

                    if(chbox4.isSelected()){
                        for(int i=0; i<20; i++){
                            LocalDate patient_date = LocalDate.parse(arr_patients[i].reporting_date);
                            if(input_date.compareTo(patient_date) >=0 & arr_patients[i].tower =='D') {
                                model.addRow(new Object[]{arr_patients[i].name, arr_patients[i].age, arr_patients[i].tower, arr_patients[i].reporting_date, patient_date.plusDays(22)});
                            }
                        }
                        label_active3.setText("TOWER D:   "+active[3]+ " Active cases");
                        add(label_active3);

                        label_recovered3.setText("                      " +recovered[3]+" Recovered cases");
                        add(label_recovered3);
                    }


                }

            });



            JTable table = new JTable(model);
            TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(table.getModel());
            table.setRowSorter(sorter);

            add(table);



            setTitle("Patients Covid19 Details");
            setLayout( new BoxLayout(getContentPane(),BoxLayout.Y_AXIS));
            setSize(500, 550 );
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        }


    }


}