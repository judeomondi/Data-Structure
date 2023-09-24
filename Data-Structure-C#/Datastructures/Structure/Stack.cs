using System;
using System.Text;

namespace Datastructures.Structure
{
	public class Stack
	{
		private class Node {
			public string data;
			public Node next;
			public Node(string data) {
				this.data = data;
			}
		}

		private Node top;

		public Boolean isEmpty() {
			return top == null;
		}

		public string peek() {
			return top.data;
		}

		public void push(string data) {
			Node newNode = new Node(data);
			newNode.next = top;
			top = newNode;
		}

		public string pop() {
			string data = top.data;
			top = top.next;
			return data;
		}


        override
        public string ToString()
        {
            StringBuilder sb = new StringBuilder("Stack[");
            Node current = top;

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

