import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class CheckBoxModelListener implements TableModelListener {
		public void tableChanged(TableModelEvent e) {
			int row = e.getFirstRow();
			int column = e.getColumn();
			if (column == BOOLEAN_COLUMN) {
				TableModel model = (TableModel) e.getSource();
				String columnName = model.getColumnName(1);
				Boolean checked = (Boolean) model.getValueAt(row, column);
				if (columnName == "NAME") {
					if (checked) {
						dShow = "";
						for (int i = 0; i < table.getRowCount(); i++) {
							if (table.getValueAt(i, 0) == Boolean.TRUE) {
								dShow += (String) table.getValueAt(i, NAME_COLUMN) + "    ";
							}
						}
						ShowSelectedEmp.setText(dShow);
					} else {
						dShow = "";
						for (int i = 0; i < table.getRowCount(); i++) {
							if (table.getValueAt(i, 0) == Boolean.TRUE) {
								dShow += (String) table.getValueAt(i, 1) + "    ";
							}
						}
						ShowSelectedEmp.setText(dShow);
					}
				}
			}
		}
	}