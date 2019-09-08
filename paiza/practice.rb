# for

# for i in 15..20 do 
# 	p i
# end


# for color in ["red","bule"] do 
# 	p color
# end

# for name, score in {tagu:200, kou:500} do 
# 	p "#{name}: #{score}"
# end

# # each
# (15..20).each do |i|
# 	p i
# end


# ["red","bule"].each do |color| 
# 	p color
# end

# {tagu:200, kou:500}.each do |name, score|  
# 	p "#{name}: #{score}"
# end

# loop

# i = 0 
# loop do 
# 	p i
# 	i += 1
# end

# 10.times do |i|
# 	if i == 7
# 		next  
# 	elsif i == 9
# 		break
# 	end

# 	p i
# end

# method

# def say_hello
# 	puts "hi!"
# end


# def say_hi(name = "tom")
# 	puts "hi! #{name}"
# end

# say_hello
# say_hi("taguch")

# p say_hi

# class

# class User 

# 	@@count = 0

# 	VERSION = 1.1
# 	attr_accessor :name
# 	# attr_reader :name
# 	# setter 
# 	# getter 
# 	def initialize(name)
# 		@@count += 1
# 		@name = name

# 	end


# 	def say_hi()
# 		self.name
# 		puts "hi! i am #{@name}"
# 		# puts "hi! i am #{self.name}"
# 		# puts "hi! i am #{name}"
# 		sayPrivate
# 	end

# 	def self.info
# 		puts "#{VERSION} User Class, #{@@count} instances"
# 	end

# 	private

# 		def sayPrivate
# 			puts "private"
# 		end
# end

# # tom = User.new("tom")
# # # tom.say_hi
# # bob = User.new("bob")
# # # bob.say_hi
# # steve = User.new("steve")
# # tom.name = "tom Jr."
# # tom.say_hi #レシーバー



# # クラスメッソド
# User.info


# # 継承
# class Admini < User

# 	# puts "Hello from #{@name}"

# 	# override
# 	def say_hi()
# 		puts "hi! admini #{@name}"
# 	end
	
# 	def sayPrivate
# 	end
# end

# tom = Admini.new("tom")
# tom.say_hi

# # アクセス
# # public
# # private
# User.new.say_hi
# Admini.new.say_Private 


# # module
# 名前空間

# def movie_encode
# end

# def movie_export
# end

module Movie

	VERSION = 1.1

	def self.encode
		puts "encoading"
	end

	def self.export
		puts "expot"
	end

end

Movie.encode
Movie.encode
p Movie::VERSION

# ミックスイン

# module Debug

# 	def info
# 		puts "#{self.class} debug info"
# 	end
# end
# class Player
# 	include Debug
# end

# class Monster
# 	include Debug
# end

# Player.new.info
# Monster.new.info

# 例外
class MyError < StandardError; end

x = gets.to_i

begin
	if x  == 3
		raise MyError
	end
	p 100 / x
rescue MyError
	puts "not 3!"
rescue => ex
	p ex.message
	p ex.class
	p "stopped!"
ensure
	puts "--END--"
end



