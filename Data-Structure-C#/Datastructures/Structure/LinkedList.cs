using System;
using System.Text;

namespace Datastructures.Structure
{
	public class LinkedList
	{
		private class Node {
			public string data;
			public Node next;
			public Node (string data) {
				this.data = data;
			}
		}

		private Node head;

		public void append(string data) {
			if (head == null) {
				head = new Node(data);
				return;
			}
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new Node(data);
		}


		public void prepend(string data) {
			Node current = new Node(data);
			current.next = head;
			head = current;
			
		}

		public void deleteWithValue(string data) {
			if (head == null) return;
			if (head.data == data) {
				head = head.next;
				return;
			}
			Node current = head;
			while (current.next != null) {
				if (current.data == data) {
					current.next = current.next.next;
					return;
				}
				current = current.next;
			}

		}

        override
        public string ToString()
        {
            StringBuilder sb = new StringBuilder("LinkedList[");
            Node current = head;

            while (current != null)
            {
                sb.Append(current.data);
                if (current.next != null)
                {
                    sb.Append(", ");
                }
                current = current.next;
            }

            sb.Append(']');
            return sb.ToString();
        }


    }
}

