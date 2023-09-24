using System;
using System.Text;

namespace Datastructures.Structure
{

	public interface Tree {
		Tree insert(string word);
		Boolean contains(string word);
		void delete(string word);
		Boolean containsPrefix(string prefix);
		List<string> wordsWithPrefix(string prefix);
	}

    public class Nodes {
        public char character { get; set; }
        public Boolean endOfWord { get; set; }
        public Dictionary<char, Nodes> children = new Dictionary<char, Nodes>();

        public Dictionary<char, Nodes> GetChildren()
        {
            return children;
        }

        // Setter method to set the entire dictionary
        public void SetDictionary(Dictionary<char, Nodes> newDictionary)
        {
            children = newDictionary;
        }

        public Nodes (char character) {
            this.character = character;
        }

    }
    public class Trie : Tree {

        public Nodes root;

        public Trie() {
            root = new Nodes(' ');
        }

        public Tree insert(string word) {
            Nodes currentNode = root;
            Dictionary<char, Nodes> children = root.GetChildren();
            foreach (char c in word.ToCharArray()) {
                if (children.ContainsKey(c)) {
                    currentNode = children[c];
                }
                else {
                    currentNode = new Nodes(c);
                    children.Add(c, currentNode);
                }
                children = currentNode.GetChildren();
            }
            currentNode.endOfWord = true;
            return this;
        }

        public Boolean contains(string word) {
            Nodes nodePresent = search(word);
            return nodePresent != null && nodePresent.endOfWord;
        }

        public Boolean containsPrefix(string prefix) {
            return search(prefix) != null;
        }

        private Nodes search(string str) {
            Nodes currentNode = null;
            Dictionary<char, Nodes> children = root.GetChildren();
            foreach (char c in str.ToCharArray()) {
                if (!children.ContainsKey(c)) {
                    return null;
                }
                currentNode = children[c];
                children = currentNode.GetChildren();
            }

            return currentNode;
        }

        public List<string> wordsWithPrefix(string prefix) {
            List<string> prefixWords = new List<string>();
            Nodes prefixNode = search(prefix);
            if (prefixNode != null) {
                AddWords(prefixNode, prefix, prefixWords);
            }
            return prefixWords;
        }

        private void AddWords(Nodes node, string word, List<string> wordList) {
            if (node.endOfWord) {
                wordList.Add(word);
            }

            foreach (var child in node.GetChildren().Values) {
                string character = child.ToString();
                AddWords(node, word + character, wordList);
            }
        }

        public void delete(string word) {
            List<Nodes> list = new List<Nodes>();
            Dictionary<char, Nodes> children = new Dictionary<char, Nodes>();
            foreach (char c in word.ToCharArray()) {
                if (!children.ContainsKey(c) || children[c] == null) {
                    break;
                }
                Nodes currentNode = children[c];
                children = currentNode.GetChildren();
                list.Add(currentNode);
            }

            if (list.Count == 0 || list.Count != word.Length) {
                return;
            }

            list[list.Count - 1].endOfWord = false;

            for (int i = list.Count - 1; i > 0;  i--) {
                Nodes current = list[i];
                if (current.endOfWord && current.GetChildren().Count == 0)
                {
                    list[i - 1].GetChildren().Remove(current.character);
                }
                else {
                    break;
                }
            }

        }

        

    }

}

