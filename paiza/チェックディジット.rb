count = gets.chomp.to_i
odd = 0
even = 0
count.times do
  # digitにはまだstringの数字が入っている
  digit = gets.chomp.split('')
  # クレジットカードは16桁
  16.times do |i|

    correct_count = i+1

    if correct_count.even?
      # iが15番目(16桁目)で、値がXの場合は処理を行わない
      # 数字にして、足す
      if correct_count == 16
        10.times do |r|
           if (odd+even+r) % 10 == 0
             puts "#{r}"
             break
           end
        end
        break
      end
      digit[i] = digit[i].to_i
      even += digit[i]
    elsif correct_count.odd?
      # 最初にintにして、数を二倍にする。
      digit[i] = digit[i].to_i * 2
      # 文字列に変換して、桁が2桁になる場合は、10の位と1の位を足す
      if digit[i].to_s.length == 2
        # 文字列にする
        digit[i] = digit[i].to_s
        digit[i] = digit[i].split('')
        # 1の位と10のくらいを足す計算
          a = digit[i][0].to_i
          b = digit[i][1].to_i
        # evenに足す
        even = even + a + b
      else
        # 二倍にしても、1桁の場合
        # integerにして、evenに足す
        digit[i] = digit[i].to_i
        even += digit[i]
      end
    end
    # 0-14番目(1-15番目)までの数字は計算し終わっているので
  end
  odd = 0
  even = 0
end
