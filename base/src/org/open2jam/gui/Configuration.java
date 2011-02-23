/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * configuration.java
 *
 * Created on Dec 14, 2010, 1:54:48 PM
 */

package org.open2jam.gui;

import java.awt.Font;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import org.lwjgl.LWJGLException;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.open2jam.Config;
import org.open2jam.parser.Event;
import org.open2jam.util.TrueTypeFont;


/**
 *
 * @author Administrador
 */
public class Configuration extends javax.swing.JFrame {

    EnumMap<Event.Channel,Integer> kb_map = Config.get().getKeyboardMap().clone();

    HashMap<Integer, Event.Channel> table_map = new HashMap<Integer,Event.Channel>();

    /** Creates new form configuration */
    public Configuration() {
        initComponents();
        loadConfig();
	this.setLocationRelativeTo(null);
    }



    private void loadConfig()
    {
        kb_map = Config.get().getKeyboardMap().clone();
        int i = 0;
        for(Map.Entry<Event.Channel,Integer> entry : kb_map.entrySet())
        {
            tKeys.setValueAt(entry.getKey().toString(), i, 0);
            tKeys.setValueAt(Keyboard.getKeyName(entry.getValue()), i, 1);
            table_map.put(i, entry.getKey());
            i++;
        }
    }


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_folders = new javax.swing.JPanel();
        bAddFolder = new javax.swing.JButton();
        bSave = new javax.swing.JButton();
        bCancel = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        tKeys_scroll = new javax.swing.JScrollPane();
        tKeys = new javax.swing.JTable();

        setTitle("Configuration");
        setResizable(false);

        bAddFolder.setText("Add Folder");

        javax.swing.GroupLayout panel_foldersLayout = new javax.swing.GroupLayout(panel_folders);
        panel_folders.setLayout(panel_foldersLayout);
        panel_foldersLayout.setHorizontalGroup(
            panel_foldersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_foldersLayout.createSequentialGroup()
                .addContainerGap(548, Short.MAX_VALUE)
                .addComponent(bAddFolder)
                .addContainerGap())
        );
        panel_foldersLayout.setVerticalGroup(
            panel_foldersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_foldersLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(bAddFolder)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bSave.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bSave.setText("Save");
        bSave.setMaximumSize(new java.awt.Dimension(65, 23));
        bSave.setMinimumSize(new java.awt.Dimension(65, 23));
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });

        bCancel.setText("Cancel");
        bCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelActionPerformed(evt);
            }
        });

        tKeys.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Key", "Assign"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tKeys.setColumnSelectionAllowed(true);
        tKeys.getTableHeader().setReorderingAllowed(false);
        tKeys.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tKeysMouseClicked(evt);
            }
        });
        tKeys_scroll.setViewportView(tKeys);
        tKeys.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tKeys_scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 643, Short.MAX_VALUE)
                    .addComponent(panel_folders, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(bSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bCancel)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_folders, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tKeys_scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCancel)
                    .addComponent(bSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelActionPerformed
        loadConfig();
        this.dispose();
    }//GEN-LAST:event_bCancelActionPerformed

    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed
	//TODO save
        Config.get().setKeyboardMap(kb_map);
        Config.get().save();
        loadConfig(); // EH ?
	this.dispose();
    }//GEN-LAST:event_bSaveActionPerformed


    private void tKeysMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tKeysMouseClicked
        int row = tKeys.getSelectedRow();
        if(tKeys.getValueAt(row, 0) == null) return;

        int code = -1;
        try {
            code = read_keyboard_key();
        } catch(LWJGLException e) {
            // FML
            return;
        }
        Event.Channel c = table_map.get(row);
        kb_map.put(c, code);
        tKeys.setValueAt(Keyboard.getKeyName(code), row, 1);
    }//GEN-LAST:event_tKeysMouseClicked

    private static Font font = new Font("Arial", Font.PLAIN, 12);
    private static TrueTypeFont trueTypeFont;

    private int read_keyboard_key() throws LWJGLException
    {
        String place = tKeys.getValueAt(tKeys.getSelectedRow(), 0).toString();
        if(Display.isCreated())throw new LWJGLException();
        
        Display.setDisplayMode(new DisplayMode(200,50));
        Display.setTitle("Assign a new key to "+place);
        Display.setIcon(null);
        Display.create();
        Display.setLocation(-1, -1);

            // enable textures since we're going to use these for our sprites
            GL11.glEnable(GL11.GL_TEXTURE_2D);

            // disable the OpenGL depth test since we're rendering 2D graphics
            GL11.glDisable(GL11.GL_DEPTH_TEST);

            // enable apha blending
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);

            GL11.glMatrixMode(GL11.GL_PROJECTION);
            GL11.glLoadIdentity();

            GL11.glOrtho(0, 200, 50, 0, -1, 1);

            GL11.glClear(GL11.GL_COLOR_BUFFER_BIT);
            GL11.glMatrixMode(GL11.GL_MODELVIEW);
            GL11.glLoadIdentity();

        trueTypeFont = new TrueTypeFont(font, false);
        
        

        // TODO: there should be some kind of text on the display to
        // tell the user to press a key or something

        int code;
        do{
            Display.update();
            trueTypeFont.drawString(10, 23, "Press a KEY for "+place, 1, -1);
            Keyboard.next();
            if(Keyboard.getEventKey() == Keyboard.KEY_ESCAPE) { return -1; }
            code = Keyboard.getEventKey();
        }
        while(code == Keyboard.CHAR_NONE);
        trueTypeFont.destroy();
        Display.destroy();
        return code;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton bAddFolder;
    private static javax.swing.JButton bCancel;
    private static javax.swing.JButton bSave;
    private static javax.swing.JSeparator jSeparator1;
    private static javax.swing.JPanel panel_folders;
    private static javax.swing.JTable tKeys;
    private static javax.swing.JScrollPane tKeys_scroll;
    // End of variables declaration//GEN-END:variables

}