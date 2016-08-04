public class LinkListDemo {
	public static void main(String[] args) {
		NodeManager nm = new NodeManager();
		nm.addNode("node1");
		nm.addNode("node2");
		nm.addNode("node3");
		nm.addNode("node4");
		nm.addNode("node5");
		nm.addNode("node6");
		nm.print();
		nm.delNode("node3");
		nm.print();
	}
}

class NodeManager {
	private Node root;
	public void addNode(String name) {
		if (root == null) {
			root = new Node(name);
		} else {
			root.add(name);
		}
	}
	
	public void print() {
		if (root != null) {
			System.out.println("-->"+root.name);
			root.print();
		}
	} 
	
	public void delNode(String name) {
		if (root.name.equals(name) ) {
			root =root.next;
		} else {
			root.del(name);
		}
	}
	class Node {
		private String name;
		private Node next;
		
		public Node(String name) {
			this.name = name; 
		}
		
		public void add(String name){
			if (this.next==null) {
				this.next = new Node(name);
			} else {
				this.next.add(name);
			}
		}
		
		public void del(String name){
			if (this.next.name.equals(name)) {
				this.next = this.next.next;
			} else {
				this.next.del(name);
			}
		}
		
		public void print() {
			if (this.next !=null) {
				System.out.println("-->"+this.next.name);
				this.next.print();
			}
		}
	}
}
