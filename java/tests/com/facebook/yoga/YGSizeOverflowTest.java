/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 *
 * @generated SignedSource<<e47ec0620d98b4bc8cef465219255176>>
 * generated by gentest/gentest-driver.ts from gentest/fixtures/YGSizeOverflowTest.html
 */

package com.facebook.yoga;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class YGSizeOverflowTest {
  @Parameterized.Parameters(name = "{0}")
  public static Iterable<TestParametrization.NodeFactory> nodeFactories() {
    return TestParametrization.nodeFactories();
  }

  @Parameterized.Parameter public TestParametrization.NodeFactory mNodeFactory;

  @Test
  public void test_nested_overflowing_child() {
    YogaConfig config = YogaConfigFactory.create();
    config.setExperimentalFeatureEnabled(YogaExperimentalFeature.ABSOLUTE_PERCENTAGE_AGAINST_PADDING_EDGE, true);

    final YogaNode root = createNode(config);
    root.setPositionType(YogaPositionType.ABSOLUTE);
    root.setWidth(100f);
    root.setHeight(100f);

    final YogaNode root_child0 = createNode(config);
    root.addChildAt(root_child0, 0);

    final YogaNode root_child0_child0 = createNode(config);
    root_child0_child0.setWidth(200f);
    root_child0_child0.setHeight(200f);
    root_child0.addChildAt(root_child0_child0, 0);
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(200f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0_child0.getLayoutY(), 0.0f);
    assertEquals(200f, root_child0_child0.getLayoutWidth(), 0.0f);
    assertEquals(200f, root_child0_child0.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(200f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(-100f, root_child0_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0_child0.getLayoutY(), 0.0f);
    assertEquals(200f, root_child0_child0.getLayoutWidth(), 0.0f);
    assertEquals(200f, root_child0_child0.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_nested_overflowing_child_in_constraint_parent() {
    YogaConfig config = YogaConfigFactory.create();
    config.setExperimentalFeatureEnabled(YogaExperimentalFeature.ABSOLUTE_PERCENTAGE_AGAINST_PADDING_EDGE, true);

    final YogaNode root = createNode(config);
    root.setPositionType(YogaPositionType.ABSOLUTE);
    root.setWidth(100f);
    root.setHeight(100f);

    final YogaNode root_child0 = createNode(config);
    root_child0.setWidth(100f);
    root_child0.setHeight(100f);
    root.addChildAt(root_child0, 0);

    final YogaNode root_child0_child0 = createNode(config);
    root_child0_child0.setWidth(200f);
    root_child0_child0.setHeight(200f);
    root_child0.addChildAt(root_child0_child0, 0);
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0_child0.getLayoutY(), 0.0f);
    assertEquals(200f, root_child0_child0.getLayoutWidth(), 0.0f);
    assertEquals(200f, root_child0_child0.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(100f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(-100f, root_child0_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0_child0.getLayoutY(), 0.0f);
    assertEquals(200f, root_child0_child0.getLayoutWidth(), 0.0f);
    assertEquals(200f, root_child0_child0.getLayoutHeight(), 0.0f);
  }

  @Test
  public void test_parent_wrap_child_size_overflowing_parent() {
    YogaConfig config = YogaConfigFactory.create();
    config.setExperimentalFeatureEnabled(YogaExperimentalFeature.ABSOLUTE_PERCENTAGE_AGAINST_PADDING_EDGE, true);

    final YogaNode root = createNode(config);
    root.setPositionType(YogaPositionType.ABSOLUTE);
    root.setWidth(100f);
    root.setHeight(100f);

    final YogaNode root_child0 = createNode(config);
    root_child0.setWidth(100f);
    root.addChildAt(root_child0, 0);

    final YogaNode root_child0_child0 = createNode(config);
    root_child0_child0.setWidth(100f);
    root_child0_child0.setHeight(200f);
    root_child0.addChildAt(root_child0_child0, 0);
    root.setDirection(YogaDirection.LTR);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(200f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0_child0.getLayoutY(), 0.0f);
    assertEquals(100f, root_child0_child0.getLayoutWidth(), 0.0f);
    assertEquals(200f, root_child0_child0.getLayoutHeight(), 0.0f);

    root.setDirection(YogaDirection.RTL);
    root.calculateLayout(YogaConstants.UNDEFINED, YogaConstants.UNDEFINED);

    assertEquals(0f, root.getLayoutX(), 0.0f);
    assertEquals(0f, root.getLayoutY(), 0.0f);
    assertEquals(100f, root.getLayoutWidth(), 0.0f);
    assertEquals(100f, root.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0.getLayoutY(), 0.0f);
    assertEquals(100f, root_child0.getLayoutWidth(), 0.0f);
    assertEquals(200f, root_child0.getLayoutHeight(), 0.0f);

    assertEquals(0f, root_child0_child0.getLayoutX(), 0.0f);
    assertEquals(0f, root_child0_child0.getLayoutY(), 0.0f);
    assertEquals(100f, root_child0_child0.getLayoutWidth(), 0.0f);
    assertEquals(200f, root_child0_child0.getLayoutHeight(), 0.0f);
  }

  private YogaNode createNode(YogaConfig config) {
    return mNodeFactory.create(config);
  }
}
