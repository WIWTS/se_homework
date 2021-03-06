# SOLID原则之单一责任原则

 ## SOLID的提出
 SOLID 是由 Robert C. Martin（敏捷宣言作者之一，曾任敏捷联盟主席）在21世纪早期提出的便于记忆的首字母缩写，指代面向对象编程和面向对象设计的五个基本原则：单一功能、开闭原则、里氏替换、接口隔离以及依赖反转。

![photo_1](./SOLID.jpg)
 
 ## 单一责任原则的内容
 内容：一个类只负责一件事，只有一个引起它变化的原因。

    In object-oriented programming, a God object is an object that knows too much or does too much. The God object is an example of an anti-pattern.
    在面向对象编程中，上帝对象指一个了解太情或者做太多事情的对象。上帝对象是反模式的一个典型。

单一职责希望避免的问题：避免修改一个地方反而引发另一个地方的问题。如果你的项目经常发生这样的问题，或你的同学经常有这样的质疑，那么应该抱着这个原则去重新审视你的业务逻辑。此外当一个类（或一个函数）足够复杂时，它可读性、健壮性、可复用性一定会存在问题：
1. 可读性差。无论是否有注释，谁都很难把握一个连续好几页的函数到底在做什么。
2. 脆弱。在很难理解一个函数职责的情况下，更改其中的一部分很容易犯错。尤其在存在很多横贯整个函数的变量时，或者存在大量条件分支的情况。
3. 难以复用。把多个职责包裹在一起就像打包销售一样，很少有其他场景恰好有需要完全一样的打包功能。


## 单一责任原则的优缺点


1. 降低类的复杂度。一个类只负责一项职责，其逻辑肯定要比负责多项职责简单得多。
2. 提高类的可读性。复杂性降低，自然其可读性会提高。
3. 提高系统的可维护性。可读性提高，那自然更容易维护了。
4. 变更引起的风险降低。变更是必然的，如果单一职责原则遵守得好，当修改一个功能时，可以显著降低对其他功能的影响。

## 具体例子说明

```js
class UserComponent { 
  // 这是第一件事情，获取用户详情数据
  getUserInfo(id) {
    this.api.getUserInfo(id).then(saveToState)
  }

  // 这是第二件事情，渲染视图的逻辑
  render() {
    const { userInfo } = this.state;
    return <div>
      <ul>
        <li>Name: { userInfo.name }</li>
        <li>Surname: { userInfo.surname }</li>
        <li>Email: { userInfo.email }</li>
      </ul>
    </div>
  }
}
```

单一意味着某些工作是独立的。比如，在类中，类方法仅完成某家独立的事情，而不是两件。但上面的示例代码中，却没有遵守这样的规定。

确实，对于一些小型的项目或者演示型项目，这样编写代码不会产生太大的问题。但是如果在大型或者复杂度很高的项目中，仍然按照这样的风格，却会带来很多麻烦，因为一个组件往往做了它本不应当做的事情。

    Big is bad, small is good…
    大即是坏，小即是好

比如对于以上的api服务，在将来的某天你做出了一些修改，增加了一些额外的逻辑，那么为了使代码能够正常工作，你至少需要修改项目中的两个地方以适应这个修改，一处修改是在API服务中，而另一处则在你的组件中。如果进一步思考的，我们会发现，修改次数与在项目直接使用API服务的次数成正比，如果项目足够复杂，足够大，一处简单的逻辑修改，就需要做出一次贯穿整个系统的适配工作。

## 引用

（1）. [读懂单一职责原则](https://segmentfault.com/a/1190000013100807)

（2）. [细说SOLID原则](https://zhuanlan.zhihu.com/p/187516195)