#include <iostream>
#include <sstream>
using namespace std;

// Define the structure for a BST node
struct Node {
    int data;
    Node* left;
    Node* right;
};

// Function to create a new BST node
Node* createNode(int data) {
    Node* newNode = new Node();
    newNode->data = data;
    newNode->left = newNode->right = nullptr;
    return newNode;
}

// Function to insert a node into the BST
Node* insertNode(Node* root, int data) {
    if (root == nullptr) {
        root = createNode(data);
    } else if (data < root->data) {
        root->left = insertNode(root->left, data);
    } else if (data > root->data) {
        root->right = insertNode(root->right, data);
    }
    return root;
}

// Function to find the LCA of two nodes in the BST
Node* findLCA(Node* root, int node1, int node2) {
    if (root == nullptr) {
        return nullptr;
    }

    // If both nodes are smaller than root, LCA lies in the left subtree
    if (node1 < root->data && node2 < root->data) {
        return findLCA(root->left, node1, node2);
    }
    // If both nodes are greater than root, LCA lies in the right subtree
    else if (node1 > root->data && node2 > root->data) {
        return findLCA(root->right, node1, node2);
    }
    // If one node is on the left and the other is on the right, root is the LCA
    else {
        return root;
    }
}

int main() {
    int n;
    cout << "Enter the number of nodes: ";
    cin >> n;
    cin.ignore(); // To ignore the newline character after entering the number

    Node* root = nullptr;
    cout << "Enter the node values: ";
    string nodesInput;
    getline(cin, nodesInput);
    stringstream ss(nodesInput);

    for (int i = 0; i < n; i++) {
        int data;
        ss >> data;
        root = insertNode(root, data);
    }

    int node1, node2;
    cout << "Enter the two nodes to find LCA: ";
    cin >> node1 >> node2;

    Node* lca = findLCA(root, node1, node2);
    if (lca != nullptr) {
        cout << "LCA of " << node1 << " and " << node2 << " is " << lca->data << endl;
    } else {
        cout << "LCA not found" << endl;
    }

    return 0;
}
