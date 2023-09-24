using System;
using System.Text;

namespace Datastructures.Structure
{
	public class Queue
	{
		private class Node {

			public string data;

			public Node next;

            public Node (string data)
			{
				this.data = data;
			}
		}

		private Node head;
		private Node tail;


		public Boolean isEmpty()
		{
			return head == null;
		}

		public string peek() {
			return head.data;
		}

		public void add(string input) {
			Node newNode = new Node(input);
			if (tail != null) {
				tail.next = newNode;
			}
			tail = newNode;

			if (head == null) {
				head = newNode;
			}
		}

		public string remove() {
			string data = head.data;
			head = head.next;
			if (head == null) {
				tail = null;
			}
			return data;
		}

		override
		public string ToString()
        {
            StringBuilder sb = new StringBuilder("Queue{");
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

            sb.Append('}');
            return sb.ToString();
        }
    }
}

