package com.google.protobuf;

import com.google.protobuf.GeneratedMessage.ExtendableMessage;
import protobuf_unittest.UnittestProto.TestAllExtensions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedMessagePre22WarningDisabledTest {
  @Test
  public void generatedMessage_makeExtensionsImmutableShouldNotThrow() {
    GeneratedMessage msg = new GeneratedMessage() {
      @Override
      protected FieldAccessorTable internalGetFieldAccessorTable() {
        return null;
      }

      @Override
      protected Message.Builder newBuilderForType(BuilderParent parent) {
        return null;
      }

      @Override
      public Message.Builder newBuilderForType() {
        return null;
      }

      @Override
      public Message.Builder toBuilder() {
        return null;
      }

      @Override
      public Message getDefaultInstanceForType() {
        return null;
      }
    };
    msg.makeExtensionsImmutable();
  }

  @Test
  public void extendableMessage_makeExtensionsImmutableShouldNotThrow(){
    GeneratedMessage.ExtendableMessage<TestAllExtensions> msg = TestAllExtensions.newBuilder().build();
    msg.makeExtensionsImmutable();
  }
}
