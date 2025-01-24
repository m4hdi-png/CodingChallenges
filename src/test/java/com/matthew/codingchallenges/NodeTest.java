package com.matthew.codingchallenges;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class NodeTest {
    
    @Test
    public void when_creating_node_data_should_match() {
        Node root = new Node(1);

        Assertions.assertEquals(1, root.data);
    }

    @Test
    public void when_appending_node_data_should_match() {
        Node root = new Node(1);
        root.appendToTail(5);

        Assertions.assertEquals(5, root.next.data);
    }

    @Test
    public void when_deleting_node_data_should_match() {
        Node root = new Node(1);
        root.appendToTail(5);

        root = Node.deleteNode(root, 1);

        Assertions.assertEquals(5, root.data);
    }
}
